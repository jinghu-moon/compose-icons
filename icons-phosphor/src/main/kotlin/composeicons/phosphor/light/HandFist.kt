package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandFist: ImageVector
    get() {
        if (_handFist != null) return _handFist!!
        _handFist = phosphorLightIcon(
            name = "HandFist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 82h-18v-18C182 51.087 173.737 39.623 161.487 35.54 149.237 31.456 135.748 35.67 128 46 120.252 35.67 106.763 31.456 94.513 35.54 82.263 39.623 74 51.087 74 64h0C64.909 57.182 52.747 56.085 42.584 61.167 32.42 66.249 26 76.637 26 88v40c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102v-16C230 95.431 216.569 82 200 82ZM152 46c9.941 0 18 8.059 18 18v18h-34c-.67 .008-1.338 .061-2 .16v-18.16c0-9.941 8.059-18 18-18ZM86 64c0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18v40c0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18ZM38 88C38 78.059 46.059 70 56 70c9.941 0 18 8.059 18 18v16c0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18ZM218 128c0 49.706-40.294 90-90 90C78.294 218 38 177.706 38 128h0c13.255 9.941 32.059 7.255 42-6 5.205 6.938 13.159 11.284 21.809 11.917 8.651 .633 17.152-2.51 23.311-8.617 3.142 6.333 8.409 11.362 14.88 14.21-11.355 8.696-18.01 22.187-18 36.49 0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6 0-18.778 15.222-34 34-34 3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-16c-9.941 0-18-8.059-18-18v-16c0-1.105 .895-2 2-2h64c9.941 0 18 8.059 18 18Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _handFist!!
    }

private var _handFist: ImageVector? = null

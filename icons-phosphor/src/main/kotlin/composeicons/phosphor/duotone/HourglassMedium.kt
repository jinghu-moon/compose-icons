package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HourglassMedium: ImageVector
    get() {
        if (_hourglassMedium != null) return _hourglassMedium!!
        _hourglassMedium = phosphorDuotoneIcon(
            name = "HourglassMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180.92 88 128 128 74.67 88Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M200 75.64v-35.64c0-8.837-7.163-16-16-16h-112C63.163 24 56 31.163 56 40v36c.011 5.034 2.38 9.771 6.4 12.8L114.67 128 62.4 167.2C58.38 170.229 56.011 174.966 56 180v36c0 8.837 7.163 16 16 16h112c8.837 0 16-7.163 16-16v-35.64c-.012-5.014-2.359-9.735-6.35-12.77L141.27 128 193.65 88.41c3.991-3.035 6.338-7.757 6.35-12.77ZM72 40h112v35.64L178.23 80h-100.9L72 76ZM128 118 98.67 96h58.4ZM184 216h-112v-36l48-36v24c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-23.92l48 36.28Z"),
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
        return _hourglassMedium!!
    }

private var _hourglassMedium: ImageVector? = null

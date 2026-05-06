package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Eyes: ImageVector
    get() {
        if (_eyes != null) return _eyes!!
        _eyes = phosphorLightIcon(
            name = "Eyes",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 34c-21.15 0-39.1 20.15-48 50.26C119.1 54.15 101.15 34 80 34 49.72 34 26 75.29 26 128c0 52.71 23.72 94 54 94 21.15 0 39.1-20.15 48-50.26 8.9 30.11 26.85 50.26 48 50.26 30.28 0 54-41.29 54-94C230 75.29 206.28 34 176 34ZM80 210C61.76 210 45.81 185.9 40.17 153.47c12.573 7.825 28.975 5.305 38.619-5.934 9.644-11.239 9.644-27.833 0-39.072C69.145 97.225 52.743 94.705 40.17 102.53 45.81 70.1 61.76 46 80 46c22.77 0 42 37.55 42 82 0 44.45-19.23 82-42 82ZM38 128c0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18ZM176 210c-18.24 0-34.19-24.1-39.83-56.53 12.573 7.825 28.975 5.305 38.619-5.934 9.644-11.239 9.644-27.833 0-39.072C165.145 97.225 148.743 94.705 136.17 102.53 141.81 70.1 157.76 46 176 46c22.77 0 42 37.55 42 82 0 44.45-19.23 82-42 82ZM134 128c0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18Z"),
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
        return _eyes!!
    }

private var _eyes: ImageVector? = null

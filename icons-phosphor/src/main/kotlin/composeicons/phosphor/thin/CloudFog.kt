package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CloudFog: ImageVector
    get() {
        if (_cloudFog != null) return _cloudFog!!
        _cloudFog = phosphorThinIcon(
            name = "CloudFog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 204h-48c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h48c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4ZM184 196h-24c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h24c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM160 228h-56c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h56c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM228 100c-.044 39.746-32.254 71.956-72 72h-80C57.47 171.984 40.604 161.303 32.668 144.558 24.731 127.813 27.142 107.996 38.862 93.642 50.581 79.289 69.516 72.963 87.51 77.39 98.646 43.839 132.471 23.315 167.373 28.932 202.275 34.549 227.953 64.649 228 100ZM220 100C219.921 65.412 192.399 37.133 157.826 36.114 123.253 35.096 94.115 61.707 92 96.23c-.127 2.209-2.021 3.897-4.23 3.77C85.561 99.873 83.873 97.979 84 95.77c.206-3.581 .681-7.141 1.42-10.65C70.428 81.496 54.687 86.814 44.966 98.789c-9.721 11.975-11.692 28.472-5.063 42.4C46.53 155.116 60.576 163.992 76 164h80c35.33-.039 63.961-28.67 64-64Z"),
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
        return _cloudFog!!
    }

private var _cloudFog: ImageVector? = null

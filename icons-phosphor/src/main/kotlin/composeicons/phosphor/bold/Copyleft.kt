package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Copyleft: ImageVector
    get() {
        if (_copyleft != null) return _copyleft!!
        _copyleft = phosphorBoldIcon(
            name = "Copyleft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 212C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84-.05 46.371-37.629 83.95-84 84ZM180 128c-.001 22.379-14.32 42.247-35.55 49.326-21.229 7.079-44.607-.217-58.04-18.116-2.724-3.416-3.376-8.044-1.702-12.08 1.674-4.036 5.411-6.843 9.753-7.328 4.343-.485 8.606 1.43 11.129 4.998 7.231 9.642 19.821 13.574 31.254 9.763 11.434-3.811 19.146-14.511 19.146-26.563 0-12.052-7.712-22.752-19.146-26.563-11.434-3.811-24.023 .121-31.254 9.763-2.523 3.568-6.786 5.482-11.129 4.998-4.343-.485-8.079-3.292-9.753-7.328-1.674-4.036-1.022-8.664 1.702-12.08C99.843 78.891 123.221 71.594 144.45 78.674 165.68 85.753 179.999 105.621 180 128Z"),
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
        return _copyleft!!
    }

private var _copyleft: ImageVector? = null

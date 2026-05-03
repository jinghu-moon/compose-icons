package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextOutdent: ImageVector
    get() {
        if (_textOutdent != null) return _textOutdent!!
        _textOutdent = phosphorDuotoneIcon(
            name = "TextOutdent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 64.000 L 216.000 192.000 L 40.000 192.000 L 40.000 88.000 L 64.000 64.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 224.000 128.000 C 224.000 132.418 220.418 136.000 216.000 136.000 L 112.000 136.000 C 107.582 136.000 104.000 132.418 104.000 128.000 C 104.000 123.582 107.582 120.000 112.000 120.000 L 216.000 120.000 C 220.418 120.000 224.000 123.582 224.000 128.000 ZM 112.000 72.000 L 216.000 72.000 C 220.418 72.000 224.000 68.418 224.000 64.000 C 224.000 59.582 220.418 56.000 216.000 56.000 L 112.000 56.000 C 107.582 56.000 104.000 59.582 104.000 64.000 C 104.000 68.418 107.582 72.000 112.000 72.000 ZM 216.000 184.000 L 40.000 184.000 C 35.582 184.000 32.000 187.582 32.000 192.000 C 32.000 196.418 35.582 200.000 40.000 200.000 L 216.000 200.000 C 220.418 200.000 224.000 196.418 224.000 192.000 C 224.000 187.582 220.418 184.000 216.000 184.000 ZM 72.000 144.000 C 75.238 144.003 78.158 142.053 79.397 139.062 C 80.636 136.071 79.951 132.628 77.660 130.340 L 43.310 96.000 L 77.660 61.660 C 80.786 58.534 80.786 53.466 77.660 50.340 C 74.534 47.214 69.466 47.214 66.340 50.340 L 26.340 90.340 C 24.838 91.841 23.994 93.877 23.994 96.000 C 23.994 98.123 24.838 100.159 26.340 101.660 L 66.340 141.660 C 67.842 143.160 69.878 144.002 72.000 144.000 Z"),
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
        return _textOutdent!!
    }

private var _textOutdent: ImageVector? = null

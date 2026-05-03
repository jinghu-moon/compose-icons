package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TextHTwo: ImageVector
    get() {
        if (_textHTwo != null) return _textHTwo!!
        _textHTwo = phosphorDuotoneIcon(
            name = "TextHTwo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 240.000 72.000 L 240.000 208.000 L 56.000 208.000 C 47.163 208.000 40.000 200.837 40.000 192.000 L 40.000 56.000 L 224.000 56.000 C 232.837 56.000 240.000 63.163 240.000 72.000 Z"),
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
                pathData = parseSvgPathData("M 248.000 208.000 C 248.000 212.418 244.418 216.000 240.000 216.000 L 192.000 216.000 C 188.970 216.000 186.200 214.288 184.845 211.578 C 183.489 208.867 183.782 205.624 185.600 203.200 L 228.760 145.640 C 232.335 141.086 233.171 134.957 230.946 129.612 C 228.721 124.267 223.783 120.541 218.033 119.869 C 212.283 119.196 206.618 121.683 203.220 126.370 C 202.235 127.678 201.453 129.128 200.900 130.670 C 199.983 133.412 197.657 135.446 194.817 135.989 C 191.977 136.533 189.065 135.501 187.200 133.292 C 185.335 131.082 184.807 128.038 185.820 125.330 C 190.028 113.451 200.816 105.149 213.377 104.122 C 225.937 103.096 237.930 109.537 244.011 120.575 C 250.092 131.612 249.129 145.191 241.550 155.260 L 208.000 200.000 L 240.000 200.000 C 244.418 200.000 248.000 203.582 248.000 208.000 ZM 144.000 48.000 C 139.582 48.000 136.000 51.582 136.000 56.000 L 136.000 108.000 L 48.000 108.000 L 48.000 56.000 C 48.000 51.582 44.418 48.000 40.000 48.000 C 35.582 48.000 32.000 51.582 32.000 56.000 L 32.000 176.000 C 32.000 180.418 35.582 184.000 40.000 184.000 C 44.418 184.000 48.000 180.418 48.000 176.000 L 48.000 124.000 L 136.000 124.000 L 136.000 176.000 C 136.000 180.418 139.582 184.000 144.000 184.000 C 148.418 184.000 152.000 180.418 152.000 176.000 L 152.000 56.000 C 152.000 51.582 148.418 48.000 144.000 48.000 Z"),
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
        return _textHTwo!!
    }

private var _textHTwo: ImageVector? = null

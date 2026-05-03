package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HouseLine: ImageVector
    get() {
        if (_houseLine != null) return _houseLine!!
        _houseLine = phosphorDuotoneIcon(
            name = "HouseLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 116.690 L 216.000 216.000 L 152.000 216.000 L 152.000 152.000 L 104.000 152.000 L 104.000 216.000 L 40.000 216.000 L 40.000 116.690 L 122.340 34.340 C 123.841 32.838 125.877 31.994 128.000 31.994 C 130.123 31.994 132.159 32.838 133.660 34.340 Z"),
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
                pathData = parseSvgPathData("M 240.000 208.000 L 224.000 208.000 L 224.000 136.000 L 226.340 138.340 C 229.471 141.466 234.544 141.461 237.670 138.330 C 240.796 135.199 240.791 130.126 237.660 127.000 L 139.310 28.680 C 133.062 22.437 122.938 22.437 116.690 28.680 L 18.340 127.000 C 15.217 130.126 15.219 135.192 18.345 138.315 C 21.471 141.438 26.537 141.436 29.660 138.310 L 32.000 136.000 L 32.000 208.000 L 16.000 208.000 C 11.582 208.000 8.000 211.582 8.000 216.000 C 8.000 220.418 11.582 224.000 16.000 224.000 L 240.000 224.000 C 244.418 224.000 248.000 220.418 248.000 216.000 C 248.000 211.582 244.418 208.000 240.000 208.000 ZM 48.000 120.000 L 128.000 40.000 L 208.000 120.000 L 208.000 208.000 L 160.000 208.000 L 160.000 152.000 C 160.000 147.582 156.418 144.000 152.000 144.000 L 104.000 144.000 C 99.582 144.000 96.000 147.582 96.000 152.000 L 96.000 208.000 L 48.000 208.000 ZM 144.000 208.000 L 112.000 208.000 L 112.000 160.000 L 144.000 160.000 Z"),
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
        return _houseLine!!
    }

private var _houseLine: ImageVector? = null

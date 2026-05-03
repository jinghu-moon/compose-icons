package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BracketsCurly: ImageVector
    get() {
        if (_bracketsCurly != null) return _bracketsCurly!!
        _bracketsCurly = phosphorDuotoneIcon(
            name = "BracketsCurly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 240.000 128.000 C 176.000 128.000 240.000 216.000 176.000 216.000 L 80.000 216.000 C 16.000 216.000 80.000 128.000 16.000 128.000 C 80.000 128.000 16.000 40.000 80.000 40.000 L 176.000 40.000 C 240.000 40.000 176.000 128.000 240.000 128.000 Z"),
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
                pathData = parseSvgPathData("M 43.180 128.000 C 46.570 130.789 49.302 134.292 51.180 138.260 C 55.980 148.160 55.980 160.260 55.980 172.000 C 55.980 196.310 56.980 208.000 79.980 208.000 C 84.398 208.000 87.980 211.582 87.980 216.000 C 87.980 220.418 84.398 224.000 79.980 224.000 C 62.500 224.000 50.660 217.860 44.780 205.740 C 39.980 195.840 39.980 183.740 39.980 172.000 C 39.980 147.690 38.980 136.000 15.980 136.000 C 11.562 136.000 7.980 132.418 7.980 128.000 C 7.980 123.582 11.562 120.000 15.980 120.000 C 38.980 120.000 39.980 108.310 39.980 84.000 C 39.980 72.280 39.980 60.160 44.780 50.260 C 50.680 38.140 62.520 32.000 80.000 32.000 C 84.418 32.000 88.000 35.582 88.000 40.000 C 88.000 44.418 84.418 48.000 80.000 48.000 C 57.000 48.000 56.000 59.690 56.000 84.000 C 56.000 95.720 56.000 107.840 51.200 117.740 C 49.316 121.710 46.578 125.214 43.180 128.000 ZM 240.000 120.000 C 217.000 120.000 216.000 108.310 216.000 84.000 C 216.000 72.280 216.000 60.160 211.200 50.260 C 205.320 38.140 193.480 32.000 176.000 32.000 C 171.582 32.000 168.000 35.582 168.000 40.000 C 168.000 44.418 171.582 48.000 176.000 48.000 C 199.000 48.000 200.000 59.690 200.000 84.000 C 200.000 95.720 200.000 107.840 204.800 117.740 C 206.678 121.708 209.410 125.211 212.800 128.000 C 209.410 130.789 206.678 134.292 204.800 138.260 C 200.000 148.160 200.000 160.260 200.000 172.000 C 200.000 196.310 199.000 208.000 176.000 208.000 C 171.582 208.000 168.000 211.582 168.000 216.000 C 168.000 220.418 171.582 224.000 176.000 224.000 C 193.480 224.000 205.320 217.860 211.200 205.740 C 216.000 195.840 216.000 183.740 216.000 172.000 C 216.000 147.690 217.000 136.000 240.000 136.000 C 244.418 136.000 248.000 132.418 248.000 128.000 C 248.000 123.582 244.418 120.000 240.000 120.000 Z"),
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
        return _bracketsCurly!!
    }

private var _bracketsCurly: ImageVector? = null

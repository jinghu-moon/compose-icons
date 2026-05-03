package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bone: ImageVector
    get() {
        if (_bone != null) return _bone!!
        _bone = phosphorFillIcon(
            name = "Bone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 231.120 107.720 C 219.499 121.052 199.900 123.937 184.930 114.520 C 184.898 114.508 184.862 114.508 184.830 114.520 L 114.480 184.880 C 114.480 184.880 114.480 184.880 114.480 184.960 C 122.283 197.529 121.602 213.593 112.763 225.456 C 103.924 237.320 88.727 242.568 74.451 238.687 C 60.174 234.806 49.726 222.586 48.110 207.880 C 33.404 206.264 21.184 195.816 17.303 181.539 C 13.422 167.263 18.670 152.066 30.534 143.227 C 42.397 134.388 58.461 133.707 71.030 141.510 C 71.062 141.522 71.098 141.522 71.130 141.510 L 141.480 71.150 C 141.480 71.150 141.480 71.150 141.480 71.070 C 133.677 58.501 134.358 42.437 143.197 30.574 C 152.036 18.710 167.233 13.462 181.509 17.343 C 195.786 21.224 206.234 33.444 207.850 48.150 C 221.235 49.559 232.716 58.317 237.614 70.853 C 242.511 83.390 240.006 97.611 231.120 107.720 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _bone!!
    }

private var _bone: ImageVector? = null

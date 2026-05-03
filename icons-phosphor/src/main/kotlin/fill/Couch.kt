package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Couch: ImageVector
    get() {
        if (_couch != null) return _couch!!
        _couch = phosphorFillIcon(
            name = "Couch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.000 100.000 L 16.000 72.000 C 16.000 63.163 23.163 56.000 32.000 56.000 L 116.000 56.000 C 118.209 56.000 120.000 57.791 120.000 60.000 L 120.000 136.000 L 64.000 136.000 C 64.000 118.327 49.673 104.000 32.000 104.000 L 20.000 104.000 C 17.791 104.000 16.000 102.209 16.000 100.000 ZM 224.000 104.000 L 236.000 104.000 C 238.209 104.000 240.000 102.209 240.000 100.000 L 240.000 72.000 C 240.000 63.163 232.837 56.000 224.000 56.000 L 140.000 56.000 C 137.791 56.000 136.000 57.791 136.000 60.000 L 136.000 136.000 L 192.000 136.000 C 192.000 118.327 206.327 104.000 224.000 104.000 ZM 232.000 120.000 L 224.000 120.000 C 215.163 120.000 208.000 127.163 208.000 136.000 L 208.000 144.000 C 208.000 148.418 204.418 152.000 200.000 152.000 L 56.000 152.000 C 51.582 152.000 48.000 148.418 48.000 144.000 L 48.000 136.000 C 48.000 127.163 40.837 120.000 32.000 120.000 L 24.000 120.000 C 15.163 120.000 8.000 127.163 8.000 136.000 L 8.000 168.000 C 8.000 176.837 15.163 184.000 24.000 184.000 L 32.000 184.000 L 32.000 199.730 C 31.937 204.019 35.197 207.628 39.470 208.000 C 41.682 208.147 43.856 207.369 45.473 205.853 C 47.090 204.336 48.005 202.217 48.000 200.000 L 48.000 184.000 L 208.000 184.000 L 208.000 199.730 C 207.942 204.013 211.202 207.613 215.470 207.980 C 217.682 208.127 219.856 207.349 221.473 205.833 C 223.090 204.316 224.005 202.197 224.000 199.980 L 224.000 184.000 L 232.000 184.000 C 240.837 184.000 248.000 176.837 248.000 168.000 L 248.000 136.000 C 248.000 127.163 240.837 120.000 232.000 120.000 Z"),
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
        return _couch!!
    }

private var _couch: ImageVector? = null

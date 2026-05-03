package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HourglassSimple: ImageVector
    get() {
        if (_hourglassSimple != null) return _hourglassSimple!!
        _hourglassSimple = phosphorBoldIcon(
            name = "HourglassSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(214.0f, 193.68f),
                    PathNode.LineTo(145.35f, 128.0f),
                    PathNode.LineTo(214.0f, 62.32f),
                    PathNode.LineTo(214.18f, 62.14f),
                    PathNode.CurveTo(219.90334f, 56.41497f, 221.61107f, 47.804405f, 218.50594f, 40.32841f),
                    PathNode.CurveTo(215.40079f, 32.852413f, 208.0952f, 27.985525f, 200.0f, 28.0f),
                    PathNode.LineTo(56.0f, 28.0f),
                    PathNode.CurveTo(47.913902f, 28.005768f, 40.62684f, 32.880074f, 37.534523f, 40.351524f),
                    PathNode.CurveTo(34.442207f, 47.82298f, 36.153126f, 56.4214f, 41.87f, 62.14f),
                    PathNode.LineTo(42.05f, 62.32f),
                    PathNode.LineTo(110.65f, 128.0f),
                    PathNode.LineTo(42.05f, 193.68f),
                    PathNode.LineTo(41.87f, 193.86f),
                    PathNode.CurveTo(36.153126f, 199.5786f, 34.442207f, 208.17702f, 37.534523f, 215.64847f),
                    PathNode.CurveTo(40.62684f, 223.11993f, 47.913902f, 227.99425f, 56.0f, 228.0f),
                    PathNode.LineTo(200.0f, 228.0f),
                    PathNode.CurveTo(208.08792f, 227.99828f, 215.37868f, 223.12544f, 218.47356f, 215.65309f),
                    PathNode.CurveTo(221.56844f, 208.18073f, 219.85815f, 199.57986f, 214.14f, 193.86f),
                    PathNode.Close,
                    PathNode.MoveTo(190.0f, 52.0f),
                    PathNode.LineTo(128.0f, 111.39f),
                    PathNode.LineTo(66.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(66.0f, 204.0f),
                    PathNode.LineTo(128.0f, 144.61f),
                    PathNode.LineTo(190.0f, 204.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _hourglassSimple!!
    }

private var _hourglassSimple: ImageVector? = null

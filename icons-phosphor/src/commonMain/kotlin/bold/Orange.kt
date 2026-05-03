package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Orange: ImageVector
    get() {
        if (_orange != null) return _orange!!
        _orange = phosphorBoldIcon(
            name = "Orange",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(174.0f, 72.36f),
                    PathNode.CurveTo(192.74629f, 59.72762f, 203.98953f, 38.605316f, 204.0f, 16.0f),
                    PathNode.CurveTo(204.0f, 9.372583f, 198.62741f, 4.0f, 192.0f, 4.0f),
                    PathNode.LineTo(184.0f, 4.0f),
                    PathNode.CurveTo(161.61755f, 4.014633f, 140.6757f, 15.042762f, 128.0f, 33.49f),
                    PathNode.CurveTo(115.324295f, 15.042762f, 94.38245f, 4.014633f, 72.0f, 4.0f),
                    PathNode.LineTo(64.0f, 4.0f),
                    PathNode.CurveTo(57.37258f, 4.0f, 52.0f, 9.372583f, 52.0f, 16.0f),
                    PathNode.CurveTo(52.0f, 22.627417f, 57.37258f, 28.0f, 64.0f, 28.0f),
                    PathNode.LineTo(72.0f, 28.0f),
                    PathNode.CurveTo(92.054436f, 28.025944f, 109.562515f, 41.588543f, 114.6f, 61.0f),
                    PathNode.CurveTo(70.15547f, 67.52401f, 36.91079f, 105.17489f, 35.94024f, 150.08522f),
                    PathNode.CurveTo(34.96969f, 194.99554f, 66.556755f, 234.04749f, 110.67794f, 242.48547f),
                    PathNode.CurveTo(154.79913f, 250.92348f, 198.56712f, 226.28285f, 214.23679f, 184.18369f),
                    PathNode.CurveTo(229.90643f, 142.0845f, 212.9008f, 94.823456f, 174.0f, 72.36f),
                    PathNode.Close,
                    PathNode.MoveTo(178.22f, 28.36f),
                    PathNode.CurveTo(173.28828f, 45.05061f, 159.00935f, 57.285213f, 141.76f, 59.6f),
                    PathNode.CurveTo(146.69981f, 42.914223f, 160.98209f, 30.68794f, 178.23f, 28.38f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(90.44463f, 220.0f, 60.0f, 189.55536f, 60.0f, 152.0f),
                    PathNode.CurveTo(60.0f, 114.44463f, 90.44463f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(165.55536f, 84.0f, 196.0f, 114.44463f, 196.0f, 152.0f),
                    PathNode.CurveTo(195.96141f, 189.53935f, 165.53935f, 219.96141f, 128.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(177.62f, 167.6f),
                    PathNode.CurveTo(172.52173f, 183.80727f, 159.82726f, 196.50172f, 143.62f, 201.6f),
                    PathNode.CurveTo(142.45427f, 201.96242f, 141.24075f, 202.14781f, 140.02f, 202.15f),
                    PathNode.CurveTo(134.09239f, 202.1543f, 129.04971f, 197.82986f, 128.15025f, 191.97089f),
                    PathNode.CurveTo(127.25079f, 186.11192f, 130.76407f, 180.47398f, 136.42f, 178.7f),
                    PathNode.CurveTo(145.15457f, 175.95576f, 151.99576f, 169.11456f, 154.74f, 160.38f),
                    PathNode.CurveTo(156.72823f, 154.05634f, 163.46634f, 150.54178f, 169.79f, 152.53f),
                    PathNode.CurveTo(176.11366f, 154.51822f, 179.62822f, 161.25633f, 177.64f, 167.58f),
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
        return _orange!!
    }

private var _orange: ImageVector? = null

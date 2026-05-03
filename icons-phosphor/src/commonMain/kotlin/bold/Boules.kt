package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Boules: ImageVector
    get() {
        if (_boules != null) return _boules!!
        _boules = phosphorBoldIcon(
            name = "Boules",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.28f, 60.75f),
                    PathNode.LineTo(60.75f, 178.28f),
                    PathNode.CurveTo(57.53683f, 173.98764f, 54.73765f, 169.4005f, 52.39f, 164.58f),
                    PathNode.LineTo(164.58f, 52.39f),
                    PathNode.CurveTo(169.4005f, 54.73765f, 173.98764f, 57.53683f, 178.28f, 60.75f),
                    PathNode.Close,
                    PathNode.MoveTo(195.28f, 77.75f),
                    PathNode.CurveTo(198.49316f, 82.042336f, 201.29234f, 86.62951f, 203.64f, 91.45f),
                    PathNode.LineTo(91.42f, 203.61f),
                    PathNode.CurveTo(86.59951f, 201.26236f, 82.01234f, 198.46317f, 77.72f, 195.25f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 44.0f),
                    PathNode.CurveTo(131.46693f, 44.007133f, 134.93015f, 44.22755f, 138.37f, 44.66f),
                    PathNode.LineTo(44.66f, 138.37f),
                    PathNode.CurveTo(41.64327f, 114.463326f, 49.05475f, 90.41402f, 65.00514f, 72.3526f),
                    PathNode.CurveTo(80.955536f, 54.29118f, 103.90376f, 43.962685f, 128.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(124.533066f, 211.99287f, 121.06986f, 211.77245f, 117.63f, 211.34f),
                    PathNode.LineTo(211.34f, 117.63f),
                    PathNode.CurveTo(214.35674f, 141.53668f, 206.94525f, 165.58598f, 190.99486f, 183.64738f),
                    PathNode.CurveTo(175.04446f, 201.70882f, 152.09624f, 212.03731f, 128.0f, 212.0f),
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
        return _boules!!
    }

private var _boules: ImageVector? = null

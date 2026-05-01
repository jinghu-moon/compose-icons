package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.User: ImageVector
    get() {
        if (_user != null) return _user!!
        _user = phosphorRegularIcon(
            name = "User",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.92f, 212.0f),
                    PathNode.CurveTo(215.69f, 185.67f, 192.22f, 166.79f, 164.83f, 157.84f),
                    PathNode.CurveTo(192.67787f, 141.26196f, 206.01761f, 108.12139f, 197.4206f, 76.873566f),
                    PathNode.CurveTo(188.8236f, 45.625736f, 160.40887f, 23.972795f, 128.0f, 23.972795f),
                    PathNode.CurveTo(95.591125f, 23.972795f, 67.17641f, 45.625736f, 58.579403f, 76.873566f),
                    PathNode.CurveTo(49.982395f, 108.12139f, 63.322132f, 141.26196f, 91.17f, 157.84f),
                    PathNode.CurveTo(63.78f, 166.78f, 40.31f, 185.66f, 25.08f, 212.0f),
                    PathNode.CurveTo(23.559504f, 214.47925f, 23.50429f, 217.58838f, 24.935799f, 220.12004f),
                    PathNode.CurveTo(26.367308f, 222.65172f, 29.060003f, 224.20706f, 31.96826f, 224.18211f),
                    PathNode.CurveTo(34.876514f, 224.15717f, 37.542133f, 222.55586f, 38.93f, 220.0f),
                    PathNode.CurveTo(57.77f, 187.44f, 91.07f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(164.93f, 168.0f, 198.23f, 187.44f, 217.07f, 220.0f),
                    PathNode.CurveTo(218.45787f, 222.55586f, 221.12349f, 224.15717f, 224.03174f, 224.18211f),
                    PathNode.CurveTo(226.94f, 224.20706f, 229.63269f, 222.65172f, 231.0642f, 220.12004f),
                    PathNode.CurveTo(232.49571f, 217.58838f, 232.44049f, 214.47925f, 230.92f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 96.0f),
                    PathNode.CurveTo(72.0f, 65.07205f, 97.07206f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(158.92795f, 40.0f, 184.0f, 65.07205f, 184.0f, 96.0f),
                    PathNode.CurveTo(184.0f, 126.92794f, 158.92795f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(97.08576f, 151.96693f, 72.033066f, 126.91424f, 72.0f, 96.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _user!!
    }

private var _user: ImageVector? = null

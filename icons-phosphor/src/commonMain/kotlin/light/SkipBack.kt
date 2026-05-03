package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SkipBack: ImageVector
    get() {
        if (_skipBack != null) return _skipBack!!
        _skipBack = phosphorLightIcon(
            name = "SkipBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(198.84f, 35.77f),
                    PathNode.CurveTo(194.38835f, 33.300644f, 188.94711f, 33.44232f, 184.63f, 36.14f),
                    PathNode.LineTo(62.0f, 112.83f),
                    PathNode.LineTo(62.0f, 40.0f),
                    PathNode.CurveTo(62.0f, 36.68629f, 59.31371f, 34.0f, 56.0f, 34.0f),
                    PathNode.CurveTo(52.68629f, 34.0f, 50.0f, 36.68629f, 50.0f, 40.0f),
                    PathNode.LineTo(50.0f, 216.0f),
                    PathNode.CurveTo(50.0f, 219.3137f, 52.68629f, 222.0f, 56.0f, 222.0f),
                    PathNode.CurveTo(59.31371f, 222.0f, 62.0f, 219.3137f, 62.0f, 216.0f),
                    PathNode.LineTo(62.0f, 143.16f),
                    PathNode.LineTo(184.63f, 219.86f),
                    PathNode.CurveTo(188.94711f, 222.55768f, 194.38835f, 222.69936f, 198.84f, 220.23f),
                    PathNode.CurveTo(203.27687f, 217.82217f, 206.02863f, 213.16803f, 206.0f, 208.12f),
                    PathNode.LineTo(206.0f, 47.88f),
                    PathNode.CurveTo(206.02863f, 42.83197f, 203.27687f, 38.17782f, 198.84f, 35.77f),
                    PathNode.Close,
                    PathNode.MoveTo(194.0f, 208.12f),
                    PathNode.CurveTo(194.00528f, 208.80719f, 193.61667f, 209.43672f, 193.0f, 209.74f),
                    PathNode.CurveTo(192.3723f, 210.08192f, 191.60983f, 210.06287f, 191.0f, 209.69f),
                    PathNode.LineTo(62.88f, 129.56f),
                    PathNode.CurveTo(62.33241f, 129.23094f, 61.997444f, 128.63885f, 61.997444f, 128.0f),
                    PathNode.CurveTo(61.997444f, 127.361145f, 62.33241f, 126.76906f, 62.88f, 126.44f),
                    PathNode.LineTo(191.0f, 46.31f),
                    PathNode.CurveTo(191.29991f, 46.119705f, 191.64505f, 46.012707f, 192.0f, 46.0f),
                    PathNode.CurveTo(192.3498f, 46.00203f, 192.69353f, 46.091404f, 193.0f, 46.26f),
                    PathNode.CurveTo(193.61667f, 46.563274f, 194.00528f, 47.192814f, 194.0f, 47.88f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _skipBack!!
    }

private var _skipBack: ImageVector? = null

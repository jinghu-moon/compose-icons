package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SkipForward: ImageVector
    get() {
        if (_skipForward != null) return _skipForward!!
        _skipForward = phosphorLightIcon(
            name = "SkipForward",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 34.0f),
                    PathNode.CurveTo(196.6863f, 34.0f, 194.0f, 36.68629f, 194.0f, 40.0f),
                    PathNode.LineTo(194.0f, 112.84f),
                    PathNode.LineTo(71.37f, 36.14f),
                    PathNode.CurveTo(67.05289f, 33.44232f, 61.611656f, 33.300644f, 57.16f, 35.77f),
                    PathNode.CurveTo(52.72313f, 38.17782f, 49.97138f, 42.83197f, 50.0f, 47.88f),
                    PathNode.LineTo(50.0f, 208.12f),
                    PathNode.CurveTo(49.97138f, 213.16803f, 52.72313f, 217.82217f, 57.16f, 220.23f),
                    PathNode.CurveTo(61.611656f, 222.69936f, 67.05289f, 222.55768f, 71.37f, 219.86f),
                    PathNode.LineTo(194.0f, 143.17f),
                    PathNode.LineTo(194.0f, 216.0f),
                    PathNode.CurveTo(194.0f, 219.3137f, 196.6863f, 222.0f, 200.0f, 222.0f),
                    PathNode.CurveTo(203.3137f, 222.0f, 206.0f, 219.3137f, 206.0f, 216.0f),
                    PathNode.LineTo(206.0f, 40.0f),
                    PathNode.CurveTo(206.0f, 36.68629f, 203.3137f, 34.0f, 200.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(193.12f, 129.56f),
                    PathNode.LineTo(65.0f, 209.69f),
                    PathNode.CurveTo(64.39017f, 210.06287f, 63.6277f, 210.08192f, 63.0f, 209.74f),
                    PathNode.CurveTo(62.38333f, 209.43672f, 61.994728f, 208.80719f, 62.0f, 208.12f),
                    PathNode.LineTo(62.0f, 47.88f),
                    PathNode.CurveTo(61.994728f, 47.192814f, 62.38333f, 46.563274f, 63.0f, 46.26f),
                    PathNode.CurveTo(63.306477f, 46.091404f, 63.650215f, 46.00203f, 64.0f, 46.0f),
                    PathNode.CurveTo(64.35494f, 46.012707f, 64.7001f, 46.119705f, 65.0f, 46.31f),
                    PathNode.LineTo(193.12f, 126.44f),
                    PathNode.CurveTo(193.66759f, 126.76906f, 194.00256f, 127.361145f, 194.00256f, 128.0f),
                    PathNode.CurveTo(194.00256f, 128.63885f, 193.66759f, 129.23094f, 193.12f, 129.56f),
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
        return _skipForward!!
    }

private var _skipForward: ImageVector? = null

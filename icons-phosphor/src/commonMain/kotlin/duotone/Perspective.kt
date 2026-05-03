package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Perspective: ImageVector
    get() {
        if (_perspective != null) return _perspective!!
        _perspective = phosphorDuotoneIcon(
            name = "Perspective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(215.99966f, 210.3718f, 214.94691f, 212.62115f, 213.12596f, 214.14087f),
                    PathNode.CurveTo(211.30501f, 215.66058f, 208.9036f, 216.29396f, 206.57f, 215.87f),
                    PathNode.LineTo(46.57f, 186.78f),
                    PathNode.CurveTo(42.766f, 186.0889f, 40.000557f, 182.77628f, 40.0f, 178.91f),
                    PathNode.LineTo(40.0f, 77.09f),
                    PathNode.CurveTo(40.000557f, 73.223724f, 42.766f, 69.911095f, 46.57f, 69.22f),
                    PathNode.LineTo(206.57f, 40.13f),
                    PathNode.CurveTo(208.9036f, 39.706043f, 211.30501f, 40.339413f, 213.12596f, 41.859123f),
                    PathNode.CurveTo(214.94691f, 43.378838f, 215.99966f, 45.62821f, 216.0f, 48.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 120.0f),
                    PathNode.LineTo(224.0f, 120.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(223.99931f, 43.256416f, 221.89383f, 38.757675f, 218.25192f, 35.71825f),
                    PathNode.CurveTo(214.61002f, 32.67882f, 209.80719f, 31.412085f, 205.14f, 32.26f),
                    PathNode.LineTo(45.14f, 61.35f),
                    PathNode.CurveTo(37.531998f, 62.73219f, 32.001118f, 69.35747f, 32.0f, 77.09f),
                    PathNode.LineTo(32.0f, 120.0f),
                    PathNode.LineTo(16.0f, 120.0f),
                    PathNode.CurveTo(11.581722f, 120.0f, 8.0f, 123.58172f, 8.0f, 128.0f),
                    PathNode.CurveTo(8.0f, 132.41827f, 11.581722f, 136.0f, 16.0f, 136.0f),
                    PathNode.LineTo(32.0f, 136.0f),
                    PathNode.LineTo(32.0f, 178.91f),
                    PathNode.CurveTo(32.001118f, 186.64253f, 37.531998f, 193.2678f, 45.14f, 194.65f),
                    PathNode.LineTo(205.14f, 223.74f),
                    PathNode.CurveTo(206.08394f, 223.90977f, 207.04091f, 223.99677f, 208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 136.0f),
                    PathNode.LineTo(240.0f, 136.0f),
                    PathNode.CurveTo(244.41827f, 136.0f, 248.0f, 132.41827f, 248.0f, 128.0f),
                    PathNode.CurveTo(248.0f, 123.58172f, 244.41827f, 120.0f, 240.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 77.09f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 120.0f),
                    PathNode.LineTo(48.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(48.0f, 178.91f),
                    PathNode.LineTo(48.0f, 136.0f),
                    PathNode.LineTo(208.0f, 136.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _perspective!!
    }

private var _perspective: ImageVector? = null

package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) return _fireExtinguisher!!
        _fireExtinguisher = phosphorDuotoneIcon(
            name = "FireExtinguisher",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 168.0f),
                    PathNode.LineTo(176.0f, 232.0f),
                    PathNode.CurveTo(176.0f, 236.41827f, 172.41827f, 240.0f, 168.0f, 240.0f),
                    PathNode.LineTo(104.0f, 240.0f),
                    PathNode.CurveTo(99.58172f, 240.0f, 96.0f, 236.41827f, 96.0f, 232.0f),
                    PathNode.LineTo(96.0f, 168.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(218.3f, 48.34f),
                    PathNode.LineTo(157.62f, 30.14f),
                    PathNode.LineTo(187.62f, 15.14f),
                    PathNode.CurveTo(191.56607f, 13.151774f, 193.15323f, 8.341075f, 191.165f, 4.395f),
                    PathNode.CurveTo(189.17677f, 0.448926f, 184.36607f, -1.138225f, 180.42f, 0.85f),
                    PathNode.LineTo(134.0f, 24.05f),
                    PathNode.CurveTo(90.61846f, 25.177164f, 56.028713f, 60.653835f, 56.0f, 104.05f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.CurveTo(56.0f, 212.41827f, 59.581722f, 216.0f, 64.0f, 216.0f),
                    PathNode.CurveTo(68.41828f, 216.0f, 72.0f, 212.41827f, 72.0f, 208.0f),
                    PathNode.LineTo(72.0f, 176.0f),
                    PathNode.LineTo(88.0f, 176.0f),
                    PathNode.LineTo(88.0f, 232.0f),
                    PathNode.CurveTo(88.0f, 240.83656f, 95.163445f, 248.0f, 104.0f, 248.0f),
                    PathNode.LineTo(168.0f, 248.0f),
                    PathNode.CurveTo(176.83656f, 248.0f, 184.0f, 240.83656f, 184.0f, 232.0f),
                    PathNode.LineTo(184.0f, 104.0f),
                    PathNode.CurveTo(183.967f, 80.59126f, 167.07654f, 60.609844f, 144.0f, 56.68f),
                    PathNode.LineTo(144.0f, 42.75f),
                    PathNode.LineTo(213.7f, 63.66f),
                    PathNode.CurveTo(216.45964f, 64.55887f, 219.48967f, 63.8926f, 221.61769f, 61.91898f),
                    PathNode.CurveTo(223.74571f, 59.945366f, 224.6379f, 56.974f, 223.94904f, 54.154583f),
                    PathNode.CurveTo(223.2602f, 51.335167f, 221.09836f, 49.10998f, 218.3f, 48.34f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 104.0f),
                    PathNode.LineTo(88.0f, 160.0f),
                    PathNode.LineTo(72.0f, 160.0f),
                    PathNode.LineTo(72.0f, 104.0f),
                    PathNode.CurveTo(72.040115f, 71.76565f, 96.02234f, 44.58009f, 128.0f, 40.52f),
                    PathNode.LineTo(128.0f, 56.68f),
                    PathNode.CurveTo(104.92347f, 60.609844f, 88.033005f, 80.59126f, 88.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 232.0f),
                    PathNode.LineTo(104.0f, 232.0f),
                    PathNode.LineTo(104.0f, 176.0f),
                    PathNode.LineTo(168.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 104.0f),
                    PathNode.LineTo(168.0f, 160.0f),
                    PathNode.LineTo(104.0f, 160.0f),
                    PathNode.LineTo(104.0f, 104.0f),
                    PathNode.CurveTo(104.0f, 86.32689f, 118.32689f, 72.0f, 136.0f, 72.0f),
                    PathNode.CurveTo(153.67311f, 72.0f, 168.0f, 86.32689f, 168.0f, 104.0f),
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
        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null

package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CirclesFour: ImageVector
    get() {
        if (_circlesFour != null) return _circlesFour!!
        _circlesFour = phosphorThinIcon(
            name = "CirclesFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(80.0f, 44.0f),
                    PathNode.CurveTo(60.11775f, 44.0f, 44.0f, 60.11775f, 44.0f, 80.0f),
                    PathNode.CurveTo(44.0f, 99.88225f, 60.11775f, 116.0f, 80.0f, 116.0f),
                    PathNode.CurveTo(99.88225f, 116.0f, 116.0f, 99.88225f, 116.0f, 80.0f),
                    PathNode.CurveTo(116.0f, 60.11775f, 99.88225f, 44.0f, 80.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 108.0f),
                    PathNode.CurveTo(64.536026f, 108.0f, 52.0f, 95.463974f, 52.0f, 80.0f),
                    PathNode.CurveTo(52.0f, 64.536026f, 64.536026f, 52.0f, 80.0f, 52.0f),
                    PathNode.CurveTo(95.463974f, 52.0f, 108.0f, 64.536026f, 108.0f, 80.0f),
                    PathNode.CurveTo(108.0f, 95.463974f, 95.463974f, 108.0f, 80.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 116.0f),
                    PathNode.CurveTo(195.88223f, 116.0f, 212.0f, 99.88225f, 212.0f, 80.0f),
                    PathNode.CurveTo(212.0f, 60.11775f, 195.88223f, 44.0f, 176.0f, 44.0f),
                    PathNode.CurveTo(156.11777f, 44.0f, 140.0f, 60.11775f, 140.0f, 80.0f),
                    PathNode.CurveTo(140.0f, 99.88225f, 156.11777f, 116.0f, 176.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 52.0f),
                    PathNode.CurveTo(191.46397f, 52.0f, 204.0f, 64.536026f, 204.0f, 80.0f),
                    PathNode.CurveTo(204.0f, 95.463974f, 191.46397f, 108.0f, 176.0f, 108.0f),
                    PathNode.CurveTo(160.53603f, 108.0f, 148.0f, 95.463974f, 148.0f, 80.0f),
                    PathNode.CurveTo(148.0f, 64.536026f, 160.53603f, 52.0f, 176.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 140.0f),
                    PathNode.CurveTo(60.11775f, 140.0f, 44.0f, 156.11777f, 44.0f, 176.0f),
                    PathNode.CurveTo(44.0f, 195.88223f, 60.11775f, 212.0f, 80.0f, 212.0f),
                    PathNode.CurveTo(99.88225f, 212.0f, 116.0f, 195.88223f, 116.0f, 176.0f),
                    PathNode.CurveTo(116.0f, 156.11777f, 99.88225f, 140.0f, 80.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 204.0f),
                    PathNode.CurveTo(64.536026f, 204.0f, 52.0f, 191.46397f, 52.0f, 176.0f),
                    PathNode.CurveTo(52.0f, 160.53603f, 64.536026f, 148.0f, 80.0f, 148.0f),
                    PathNode.CurveTo(95.463974f, 148.0f, 108.0f, 160.53603f, 108.0f, 176.0f),
                    PathNode.CurveTo(108.0f, 191.46397f, 95.463974f, 204.0f, 80.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 140.0f),
                    PathNode.CurveTo(156.11777f, 140.0f, 140.0f, 156.11777f, 140.0f, 176.0f),
                    PathNode.CurveTo(140.0f, 195.88223f, 156.11777f, 212.0f, 176.0f, 212.0f),
                    PathNode.CurveTo(195.88223f, 212.0f, 212.0f, 195.88223f, 212.0f, 176.0f),
                    PathNode.CurveTo(212.0f, 156.11777f, 195.88223f, 140.0f, 176.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 204.0f),
                    PathNode.CurveTo(160.53603f, 204.0f, 148.0f, 191.46397f, 148.0f, 176.0f),
                    PathNode.CurveTo(148.0f, 160.53603f, 160.53603f, 148.0f, 176.0f, 148.0f),
                    PathNode.CurveTo(191.46397f, 148.0f, 204.0f, 160.53603f, 204.0f, 176.0f),
                    PathNode.CurveTo(204.0f, 191.46397f, 191.46397f, 204.0f, 176.0f, 204.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _circlesFour!!
    }

private var _circlesFour: ImageVector? = null

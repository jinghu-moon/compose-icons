package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowElbowUpRight: ImageVector
    get() {
        if (_arrowElbowUpRight != null) return _arrowElbowUpRight!!
        _arrowElbowUpRight = phosphorDuotoneIcon(
            name = "ArrowElbowUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 80.0f),
                    PathNode.LineTo(168.0f, 128.0f),
                    PathNode.LineTo(168.0f, 32.0f),
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
                    PathNode.MoveTo(221.66f, 74.34f),
                    PathNode.LineTo(173.66f, 26.34f),
                    PathNode.CurveTo(171.3719f, 24.049358f, 167.92874f, 23.36368f, 164.93768f, 24.60302f),
                    PathNode.CurveTo(161.94662f, 25.842361f, 159.99745f, 28.762346f, 160.0f, 32.0f),
                    PathNode.LineTo(160.0f, 72.0f),
                    PathNode.LineTo(72.0f, 72.0f),
                    PathNode.CurveTo(67.58172f, 72.0f, 64.0f, 75.58172f, 64.0f, 80.0f),
                    PathNode.LineTo(64.0f, 224.0f),
                    PathNode.CurveTo(64.0f, 228.41827f, 67.58172f, 232.0f, 72.0f, 232.0f),
                    PathNode.CurveTo(76.41828f, 232.0f, 80.0f, 228.41827f, 80.0f, 224.0f),
                    PathNode.LineTo(80.0f, 88.0f),
                    PathNode.LineTo(160.0f, 88.0f),
                    PathNode.LineTo(160.0f, 128.0f),
                    PathNode.CurveTo(159.99745f, 131.23766f, 161.94662f, 134.15764f, 164.93768f, 135.39697f),
                    PathNode.CurveTo(167.92874f, 136.63632f, 171.3719f, 135.95064f, 173.66f, 133.66f),
                    PathNode.LineTo(221.66f, 85.66f),
                    PathNode.CurveTo(223.16223f, 84.159454f, 224.00629f, 82.123276f, 224.00629f, 80.0f),
                    PathNode.CurveTo(224.00629f, 77.876724f, 223.16223f, 75.840546f, 221.66f, 74.34f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 108.69f),
                    PathNode.LineTo(176.0f, 51.31f),
                    PathNode.LineTo(204.69f, 80.0f),
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
        return _arrowElbowUpRight!!
    }

private var _arrowElbowUpRight: ImageVector? = null

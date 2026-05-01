package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CirclesThreePlus: ImageVector
    get() {
        if (_circlesThreePlus != null) return _circlesThreePlus!!
        _circlesThreePlus = phosphorFillIcon(
            name = "CirclesThreePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 80.0f),
                    PathNode.CurveTo(120.0f, 102.09139f, 102.09139f, 120.0f, 80.0f, 120.0f),
                    PathNode.CurveTo(57.90861f, 120.0f, 40.0f, 102.09139f, 40.0f, 80.0f),
                    PathNode.CurveTo(40.0f, 57.90861f, 57.90861f, 40.0f, 80.0f, 40.0f),
                    PathNode.CurveTo(102.09139f, 40.0f, 120.0f, 57.90861f, 120.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 120.0f),
                    PathNode.CurveTo(198.09138f, 120.0f, 216.0f, 102.09139f, 216.0f, 80.0f),
                    PathNode.CurveTo(216.0f, 57.90861f, 198.09138f, 40.0f, 176.0f, 40.0f),
                    PathNode.CurveTo(153.90862f, 40.0f, 136.0f, 57.90861f, 136.0f, 80.0f),
                    PathNode.CurveTo(136.0f, 102.09139f, 153.90862f, 120.0f, 176.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 136.0f),
                    PathNode.CurveTo(57.90861f, 136.0f, 40.0f, 153.90862f, 40.0f, 176.0f),
                    PathNode.CurveTo(40.0f, 198.09138f, 57.90861f, 216.0f, 80.0f, 216.0f),
                    PathNode.CurveTo(102.09139f, 216.0f, 120.0f, 198.09138f, 120.0f, 176.0f),
                    PathNode.CurveTo(120.0f, 153.90862f, 102.09139f, 136.0f, 80.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 168.0f),
                    PathNode.LineTo(184.0f, 168.0f),
                    PathNode.LineTo(184.0f, 144.0f),
                    PathNode.CurveTo(184.0f, 139.58173f, 180.41827f, 136.0f, 176.0f, 136.0f),
                    PathNode.CurveTo(171.58173f, 136.0f, 168.0f, 139.58173f, 168.0f, 144.0f),
                    PathNode.LineTo(168.0f, 168.0f),
                    PathNode.LineTo(144.0f, 168.0f),
                    PathNode.CurveTo(139.58173f, 168.0f, 136.0f, 171.58173f, 136.0f, 176.0f),
                    PathNode.CurveTo(136.0f, 180.41827f, 139.58173f, 184.0f, 144.0f, 184.0f),
                    PathNode.LineTo(168.0f, 184.0f),
                    PathNode.LineTo(168.0f, 208.0f),
                    PathNode.CurveTo(168.0f, 212.41827f, 171.58173f, 216.0f, 176.0f, 216.0f),
                    PathNode.CurveTo(180.41827f, 216.0f, 184.0f, 212.41827f, 184.0f, 208.0f),
                    PathNode.LineTo(184.0f, 184.0f),
                    PathNode.LineTo(208.0f, 184.0f),
                    PathNode.CurveTo(212.41827f, 184.0f, 216.0f, 180.41827f, 216.0f, 176.0f),
                    PathNode.CurveTo(216.0f, 171.58173f, 212.41827f, 168.0f, 208.0f, 168.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _circlesThreePlus!!
    }

private var _circlesThreePlus: ImageVector? = null

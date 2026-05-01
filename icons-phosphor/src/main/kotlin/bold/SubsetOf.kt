package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.SubsetOf: ImageVector
    get() {
        if (_subsetOf != null) return _subsetOf!!
        _subsetOf = phosphorBoldIcon(
            name = "SubsetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 214.62741f, 206.62741f, 220.0f, 200.0f, 220.0f),
                    PathNode.LineTo(48.0f, 220.0f),
                    PathNode.CurveTo(41.37258f, 220.0f, 36.0f, 214.62741f, 36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 201.37259f, 41.37258f, 196.0f, 48.0f, 196.0f),
                    PathNode.LineTo(200.0f, 196.0f),
                    PathNode.CurveTo(206.62741f, 196.0f, 212.0f, 201.37259f, 212.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 156.0f),
                    PathNode.LineTo(104.0f, 156.0f),
                    PathNode.CurveTo(79.69947f, 156.0f, 60.0f, 136.30052f, 60.0f, 112.0f),
                    PathNode.CurveTo(60.0f, 87.69947f, 79.69947f, 68.0f, 104.0f, 68.0f),
                    PathNode.LineTo(200.0f, 68.0f),
                    PathNode.CurveTo(206.62741f, 68.0f, 212.0f, 62.62742f, 212.0f, 56.0f),
                    PathNode.CurveTo(212.0f, 49.37258f, 206.62741f, 44.0f, 200.0f, 44.0f),
                    PathNode.LineTo(104.0f, 44.0f),
                    PathNode.CurveTo(66.44463f, 44.0f, 36.0f, 74.44463f, 36.0f, 112.0f),
                    PathNode.CurveTo(36.0f, 149.55536f, 66.44463f, 180.0f, 104.0f, 180.0f),
                    PathNode.LineTo(200.0f, 180.0f),
                    PathNode.CurveTo(206.62741f, 180.0f, 212.0f, 174.62741f, 212.0f, 168.0f),
                    PathNode.CurveTo(212.0f, 161.37259f, 206.62741f, 156.0f, 200.0f, 156.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _subsetOf!!
    }

private var _subsetOf: ImageVector? = null

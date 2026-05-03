package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SubsetProperOf: ImageVector
    get() {
        if (_subsetProperOf != null) return _subsetProperOf!!
        _subsetProperOf = phosphorLightIcon(
            name = "SubsetProperOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(206.0f, 208.0f),
                    PathNode.CurveTo(206.0f, 211.3137f, 203.3137f, 214.0f, 200.0f, 214.0f),
                    PathNode.LineTo(128.0f, 214.0f),
                    PathNode.CurveTo(80.50351f, 214.0f, 42.0f, 175.49649f, 42.0f, 128.0f),
                    PathNode.CurveTo(42.0f, 80.50351f, 80.50351f, 42.0f, 128.0f, 42.0f),
                    PathNode.LineTo(200.0f, 42.0f),
                    PathNode.CurveTo(203.3137f, 42.0f, 206.0f, 44.68629f, 206.0f, 48.0f),
                    PathNode.CurveTo(206.0f, 51.31371f, 203.3137f, 54.0f, 200.0f, 54.0f),
                    PathNode.LineTo(128.0f, 54.0f),
                    PathNode.CurveTo(87.13093f, 54.0f, 54.0f, 87.13093f, 54.0f, 128.0f),
                    PathNode.CurveTo(54.0f, 168.86908f, 87.13093f, 202.0f, 128.0f, 202.0f),
                    PathNode.LineTo(200.0f, 202.0f),
                    PathNode.CurveTo(203.3137f, 202.0f, 206.0f, 204.6863f, 206.0f, 208.0f),
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
        return _subsetProperOf!!
    }

private var _subsetProperOf: ImageVector? = null

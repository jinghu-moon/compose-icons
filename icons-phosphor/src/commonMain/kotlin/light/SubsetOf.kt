package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.SubsetOf: ImageVector
    get() {
        if (_subsetOf != null) return _subsetOf!!
        _subsetOf = phosphorLightIcon(
            name = "SubsetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(206.0f, 208.0f),
                    PathNode.CurveTo(206.0f, 211.3137f, 203.3137f, 214.0f, 200.0f, 214.0f),
                    PathNode.LineTo(48.0f, 214.0f),
                    PathNode.CurveTo(44.68629f, 214.0f, 42.0f, 211.3137f, 42.0f, 208.0f),
                    PathNode.CurveTo(42.0f, 204.6863f, 44.68629f, 202.0f, 48.0f, 202.0f),
                    PathNode.LineTo(200.0f, 202.0f),
                    PathNode.CurveTo(203.3137f, 202.0f, 206.0f, 204.6863f, 206.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 162.0f),
                    PathNode.LineTo(104.0f, 162.0f),
                    PathNode.CurveTo(76.385765f, 162.0f, 54.0f, 139.61424f, 54.0f, 112.0f),
                    PathNode.CurveTo(54.0f, 84.385765f, 76.385765f, 62.0f, 104.0f, 62.0f),
                    PathNode.LineTo(200.0f, 62.0f),
                    PathNode.CurveTo(203.3137f, 62.0f, 206.0f, 59.31371f, 206.0f, 56.0f),
                    PathNode.CurveTo(206.0f, 52.68629f, 203.3137f, 50.0f, 200.0f, 50.0f),
                    PathNode.LineTo(104.0f, 50.0f),
                    PathNode.CurveTo(69.75835f, 50.0f, 42.0f, 77.75835f, 42.0f, 112.0f),
                    PathNode.CurveTo(42.0f, 146.24165f, 69.75835f, 174.0f, 104.0f, 174.0f),
                    PathNode.LineTo(200.0f, 174.0f),
                    PathNode.CurveTo(203.3137f, 174.0f, 206.0f, 171.3137f, 206.0f, 168.0f),
                    PathNode.CurveTo(206.0f, 164.6863f, 203.3137f, 162.0f, 200.0f, 162.0f),
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
        return _subsetOf!!
    }

private var _subsetOf: ImageVector? = null

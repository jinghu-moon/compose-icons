package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TelevisionSimple: ImageVector
    get() {
        if (_televisionSimple != null) return _televisionSimple!!
        _televisionSimple = phosphorLightIcon(
            name = "TelevisionSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 66.0f),
                    PathNode.LineTo(142.48f, 66.0f),
                    PathNode.LineTo(180.24f, 28.24f),
                    PathNode.CurveTo(182.44287f, 25.875921f, 182.37787f, 22.191923f, 180.09297f, 19.907026f),
                    PathNode.CurveTo(177.80807f, 17.62213f, 174.12408f, 17.557129f, 171.76f, 19.76f),
                    PathNode.LineTo(128.0f, 63.51f),
                    PathNode.LineTo(84.24f, 19.76f),
                    PathNode.CurveTo(82.74423f, 18.154774f, 80.491554f, 17.494007f, 78.3657f, 18.036915f),
                    PathNode.CurveTo(76.23982f, 18.579824f, 74.57983f, 20.239822f, 74.03692f, 22.365688f),
                    PathNode.CurveTo(73.494f, 24.491556f, 74.15478f, 26.744236f, 75.76f, 28.24f),
                    PathNode.LineTo(113.52f, 66.0f),
                    PathNode.LineTo(40.0f, 66.0f),
                    PathNode.CurveTo(32.268013f, 66.0f, 26.0f, 72.26801f, 26.0f, 80.0f),
                    PathNode.LineTo(26.0f, 200.0f),
                    PathNode.CurveTo(26.0f, 207.73198f, 32.268013f, 214.0f, 40.0f, 214.0f),
                    PathNode.LineTo(216.0f, 214.0f),
                    PathNode.CurveTo(223.73198f, 214.0f, 230.0f, 207.73198f, 230.0f, 200.0f),
                    PathNode.LineTo(230.0f, 80.0f),
                    PathNode.CurveTo(230.0f, 72.26801f, 223.73198f, 66.0f, 216.0f, 66.0f),
                    PathNode.Close,
                    PathNode.MoveTo(218.0f, 200.0f),
                    PathNode.CurveTo(218.0f, 201.10457f, 217.10457f, 202.0f, 216.0f, 202.0f),
                    PathNode.LineTo(40.0f, 202.0f),
                    PathNode.CurveTo(38.89543f, 202.0f, 38.0f, 201.10457f, 38.0f, 200.0f),
                    PathNode.LineTo(38.0f, 80.0f),
                    PathNode.CurveTo(38.0f, 78.89543f, 38.89543f, 78.0f, 40.0f, 78.0f),
                    PathNode.LineTo(216.0f, 78.0f),
                    PathNode.CurveTo(217.10457f, 78.0f, 218.0f, 78.89543f, 218.0f, 80.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _televisionSimple!!
    }

private var _televisionSimple: ImageVector? = null

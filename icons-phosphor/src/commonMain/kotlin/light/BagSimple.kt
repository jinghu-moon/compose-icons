package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BagSimple: ImageVector
    get() {
        if (_bagSimple != null) return _bagSimple!!
        _bagSimple = phosphorLightIcon(
            name = "BagSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 66.0f),
                    PathNode.LineTo(174.0f, 66.0f),
                    PathNode.LineTo(174.0f, 64.0f),
                    PathNode.CurveTo(174.0f, 38.594906f, 153.4051f, 18.0f, 128.0f, 18.0f),
                    PathNode.CurveTo(102.5949f, 18.0f, 82.0f, 38.594906f, 82.0f, 64.0f),
                    PathNode.LineTo(82.0f, 66.0f),
                    PathNode.LineTo(40.0f, 66.0f),
                    PathNode.CurveTo(32.268013f, 66.0f, 26.0f, 72.26801f, 26.0f, 80.0f),
                    PathNode.LineTo(26.0f, 200.0f),
                    PathNode.CurveTo(26.0f, 207.73198f, 32.268013f, 214.0f, 40.0f, 214.0f),
                    PathNode.LineTo(216.0f, 214.0f),
                    PathNode.CurveTo(223.73198f, 214.0f, 230.0f, 207.73198f, 230.0f, 200.0f),
                    PathNode.LineTo(230.0f, 80.0f),
                    PathNode.CurveTo(230.0f, 72.26801f, 223.73198f, 66.0f, 216.0f, 66.0f),
                    PathNode.Close,
                    PathNode.MoveTo(94.0f, 64.0f),
                    PathNode.CurveTo(94.0f, 45.222317f, 109.22232f, 30.0f, 128.0f, 30.0f),
                    PathNode.CurveTo(146.77768f, 30.0f, 162.0f, 45.222317f, 162.0f, 64.0f),
                    PathNode.LineTo(162.0f, 66.0f),
                    PathNode.LineTo(94.0f, 66.0f),
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
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bagSimple!!
    }

private var _bagSimple: ImageVector? = null

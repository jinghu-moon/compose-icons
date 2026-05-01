package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AlignTop: ImageVector
    get() {
        if (_alignTop != null) return _alignTop!!
        _alignTop = phosphorLightIcon(
            name = "AlignTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 40.0f),
                    PathNode.CurveTo(222.0f, 43.31371f, 219.3137f, 46.0f, 216.0f, 46.0f),
                    PathNode.LineTo(40.0f, 46.0f),
                    PathNode.CurveTo(36.68629f, 46.0f, 34.0f, 43.31371f, 34.0f, 40.0f),
                    PathNode.CurveTo(34.0f, 36.68629f, 36.68629f, 34.0f, 40.0f, 34.0f),
                    PathNode.LineTo(216.0f, 34.0f),
                    PathNode.CurveTo(219.3137f, 34.0f, 222.0f, 36.68629f, 222.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(206.0f, 80.0f),
                    PathNode.LineTo(206.0f, 176.0f),
                    PathNode.CurveTo(206.0f, 183.73198f, 199.73198f, 190.0f, 192.0f, 190.0f),
                    PathNode.LineTo(152.0f, 190.0f),
                    PathNode.CurveTo(144.26802f, 190.0f, 138.0f, 183.73198f, 138.0f, 176.0f),
                    PathNode.LineTo(138.0f, 80.0f),
                    PathNode.CurveTo(138.0f, 72.26801f, 144.26802f, 66.0f, 152.0f, 66.0f),
                    PathNode.LineTo(192.0f, 66.0f),
                    PathNode.CurveTo(199.73198f, 66.0f, 206.0f, 72.26801f, 206.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(194.0f, 80.0f),
                    PathNode.CurveTo(194.0f, 78.89543f, 193.10457f, 78.0f, 192.0f, 78.0f),
                    PathNode.LineTo(152.0f, 78.0f),
                    PathNode.CurveTo(150.89543f, 78.0f, 150.0f, 78.89543f, 150.0f, 80.0f),
                    PathNode.LineTo(150.0f, 176.0f),
                    PathNode.CurveTo(150.0f, 177.10457f, 150.89543f, 178.0f, 152.0f, 178.0f),
                    PathNode.LineTo(192.0f, 178.0f),
                    PathNode.CurveTo(193.10457f, 178.0f, 194.0f, 177.10457f, 194.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(118.0f, 80.0f),
                    PathNode.LineTo(118.0f, 216.0f),
                    PathNode.CurveTo(118.0f, 223.73198f, 111.73199f, 230.0f, 104.0f, 230.0f),
                    PathNode.LineTo(64.0f, 230.0f),
                    PathNode.CurveTo(56.268013f, 230.0f, 50.0f, 223.73198f, 50.0f, 216.0f),
                    PathNode.LineTo(50.0f, 80.0f),
                    PathNode.CurveTo(50.0f, 72.26801f, 56.268013f, 66.0f, 64.0f, 66.0f),
                    PathNode.LineTo(104.0f, 66.0f),
                    PathNode.CurveTo(111.73199f, 66.0f, 118.0f, 72.26801f, 118.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(106.0f, 80.0f),
                    PathNode.CurveTo(106.0f, 78.89543f, 105.10457f, 78.0f, 104.0f, 78.0f),
                    PathNode.LineTo(64.0f, 78.0f),
                    PathNode.CurveTo(62.89543f, 78.0f, 62.0f, 78.89543f, 62.0f, 80.0f),
                    PathNode.LineTo(62.0f, 216.0f),
                    PathNode.CurveTo(62.0f, 217.10457f, 62.89543f, 218.0f, 64.0f, 218.0f),
                    PathNode.LineTo(104.0f, 218.0f),
                    PathNode.CurveTo(105.10457f, 218.0f, 106.0f, 217.10457f, 106.0f, 216.0f),
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
        return _alignTop!!
    }

private var _alignTop: ImageVector? = null

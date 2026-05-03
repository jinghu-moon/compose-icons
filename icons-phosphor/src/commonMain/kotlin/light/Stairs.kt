package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Stairs: ImageVector
    get() {
        if (_stairs != null) return _stairs!!
        _stairs = phosphorLightIcon(
            name = "Stairs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 26.0f),
                    PathNode.LineTo(56.0f, 26.0f),
                    PathNode.CurveTo(48.268013f, 26.0f, 42.0f, 32.268013f, 42.0f, 40.0f),
                    PathNode.LineTo(42.0f, 216.0f),
                    PathNode.CurveTo(42.0f, 223.73198f, 48.268013f, 230.0f, 56.0f, 230.0f),
                    PathNode.LineTo(200.0f, 230.0f),
                    PathNode.CurveTo(207.73198f, 230.0f, 214.0f, 223.73198f, 214.0f, 216.0f),
                    PathNode.LineTo(214.0f, 40.0f),
                    PathNode.CurveTo(214.0f, 32.268013f, 207.73198f, 26.0f, 200.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 142.0f),
                    PathNode.LineTo(202.0f, 142.0f),
                    PathNode.LineTo(202.0f, 170.0f),
                    PathNode.LineTo(110.0f, 170.0f),
                    PathNode.LineTo(110.0f, 142.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.0f, 130.0f),
                    PathNode.LineTo(158.0f, 102.0f),
                    PathNode.LineTo(202.0f, 102.0f),
                    PathNode.LineTo(202.0f, 130.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 38.0f),
                    PathNode.LineTo(200.0f, 38.0f),
                    PathNode.CurveTo(201.10457f, 38.0f, 202.0f, 38.89543f, 202.0f, 40.0f),
                    PathNode.LineTo(202.0f, 90.0f),
                    PathNode.LineTo(152.0f, 90.0f),
                    PathNode.CurveTo(148.6863f, 90.0f, 146.0f, 92.686295f, 146.0f, 96.0f),
                    PathNode.LineTo(146.0f, 130.0f),
                    PathNode.LineTo(104.0f, 130.0f),
                    PathNode.CurveTo(100.686295f, 130.0f, 98.0f, 132.6863f, 98.0f, 136.0f),
                    PathNode.LineTo(98.0f, 170.0f),
                    PathNode.LineTo(54.0f, 170.0f),
                    PathNode.LineTo(54.0f, 40.0f),
                    PathNode.CurveTo(54.0f, 38.89543f, 54.89543f, 38.0f, 56.0f, 38.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 218.0f),
                    PathNode.LineTo(56.0f, 218.0f),
                    PathNode.CurveTo(54.89543f, 218.0f, 54.0f, 217.10457f, 54.0f, 216.0f),
                    PathNode.LineTo(54.0f, 182.0f),
                    PathNode.LineTo(202.0f, 182.0f),
                    PathNode.LineTo(202.0f, 216.0f),
                    PathNode.CurveTo(202.0f, 217.10457f, 201.10457f, 218.0f, 200.0f, 218.0f),
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
        return _stairs!!
    }

private var _stairs: ImageVector? = null

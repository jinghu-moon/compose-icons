package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HandSoap: ImageVector
    get() {
        if (_handSoap != null) return _handSoap!!
        _handSoap = phosphorLightIcon(
            name = "HandSoap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(182.0f, 98.48f),
                    PathNode.LineTo(182.0f, 88.0f),
                    PathNode.CurveTo(182.0f, 71.43146f, 168.56854f, 58.0f, 152.0f, 58.0f),
                    PathNode.LineTo(134.0f, 58.0f),
                    PathNode.LineTo(134.0f, 30.0f),
                    PathNode.LineTo(168.0f, 30.0f),
                    PathNode.CurveTo(173.52284f, 30.0f, 178.0f, 34.477154f, 178.0f, 40.0f),
                    PathNode.CurveTo(178.0f, 43.31371f, 180.6863f, 46.0f, 184.0f, 46.0f),
                    PathNode.CurveTo(187.3137f, 46.0f, 190.0f, 43.31371f, 190.0f, 40.0f),
                    PathNode.CurveTo(190.0f, 27.849735f, 180.15027f, 18.0f, 168.0f, 18.0f),
                    PathNode.LineTo(104.0f, 18.0f),
                    PathNode.CurveTo(100.686295f, 18.0f, 98.0f, 20.68629f, 98.0f, 24.0f),
                    PathNode.CurveTo(98.0f, 27.31371f, 100.686295f, 30.0f, 104.0f, 30.0f),
                    PathNode.LineTo(122.0f, 30.0f),
                    PathNode.LineTo(122.0f, 58.0f),
                    PathNode.LineTo(104.0f, 58.0f),
                    PathNode.CurveTo(87.43146f, 58.0f, 74.0f, 71.43146f, 74.0f, 88.0f),
                    PathNode.LineTo(74.0f, 98.48f),
                    PathNode.CurveTo(55.575714f, 101.44721f, 42.022533f, 117.338326f, 42.0f, 136.0f),
                    PathNode.LineTo(42.0f, 216.0f),
                    PathNode.CurveTo(42.0f, 223.73198f, 48.268013f, 230.0f, 56.0f, 230.0f),
                    PathNode.LineTo(200.0f, 230.0f),
                    PathNode.CurveTo(207.73198f, 230.0f, 214.0f, 223.73198f, 214.0f, 216.0f),
                    PathNode.LineTo(214.0f, 136.0f),
                    PathNode.CurveTo(213.97746f, 117.338326f, 200.42429f, 101.44721f, 182.0f, 98.48f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 70.0f),
                    PathNode.LineTo(152.0f, 70.0f),
                    PathNode.CurveTo(161.94113f, 70.0f, 170.0f, 78.05888f, 170.0f, 88.0f),
                    PathNode.LineTo(170.0f, 98.0f),
                    PathNode.LineTo(86.0f, 98.0f),
                    PathNode.LineTo(86.0f, 88.0f),
                    PathNode.CurveTo(86.0f, 78.05888f, 94.05888f, 70.0f, 104.0f, 70.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 216.0f),
                    PathNode.CurveTo(202.0f, 217.10457f, 201.10457f, 218.0f, 200.0f, 218.0f),
                    PathNode.LineTo(56.0f, 218.0f),
                    PathNode.CurveTo(54.89543f, 218.0f, 54.0f, 217.10457f, 54.0f, 216.0f),
                    PathNode.LineTo(54.0f, 136.0f),
                    PathNode.CurveTo(54.0f, 121.640594f, 65.640594f, 110.0f, 80.0f, 110.0f),
                    PathNode.LineTo(176.0f, 110.0f),
                    PathNode.CurveTo(190.3594f, 110.0f, 202.0f, 121.640594f, 202.0f, 136.0f),
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
        return _handSoap!!
    }

private var _handSoap: ImageVector? = null

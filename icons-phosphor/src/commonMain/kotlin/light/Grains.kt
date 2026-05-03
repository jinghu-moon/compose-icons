package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Grains: ImageVector
    get() {
        if (_grains != null) return _grains!!
        _grains = phosphorLightIcon(
            name = "Grains",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 58.0f),
                    PathNode.CurveTo(196.72989f, 57.990486f, 185.56915f, 60.20972f, 175.16f, 64.53f),
                    PathNode.CurveTo(161.45f, 34.31f, 132.0f, 19.3f, 130.68f, 18.63f),
                    PathNode.CurveTo(128.99263f, 17.787603f, 127.00737f, 17.787603f, 125.32f, 18.63f),
                    PathNode.CurveTo(123.99f, 19.3f, 94.55f, 34.31f, 80.84f, 64.53f),
                    PathNode.CurveTo(70.43061f, 60.21048f, 59.270027f, 57.99128f, 48.0f, 58.0f),
                    PathNode.CurveTo(44.68629f, 58.0f, 42.0f, 60.68629f, 42.0f, 64.0f),
                    PathNode.LineTo(42.0f, 144.0f),
                    PathNode.CurveTo(42.0f, 191.49649f, 80.50351f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(175.49649f, 230.0f, 214.0f, 191.49649f, 214.0f, 144.0f),
                    PathNode.LineTo(214.0f, 64.0f),
                    PathNode.CurveTo(214.0f, 60.68629f, 211.3137f, 58.0f, 208.0f, 58.0f),
                    PathNode.Close,
                    PathNode.MoveTo(122.0f, 217.76f),
                    PathNode.CurveTo(83.60548f, 214.58858f, 54.04601f, 182.52525f, 54.0f, 144.0f),
                    PathNode.LineTo(54.0f, 126.24f),
                    PathNode.CurveTo(92.39452f, 129.41142f, 121.95399f, 161.47475f, 122.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(122.0f, 156.25f),
                    PathNode.CurveTo(107.59807f, 131.94028f, 82.18514f, 116.24405f, 54.0f, 114.25f),
                    PathNode.LineTo(54.0f, 70.25f),
                    PathNode.CurveTo(92.38845f, 73.425705f, 121.944016f, 105.48045f, 122.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(91.58f, 69.91f),
                    PathNode.CurveTo(101.24f, 48.31f, 120.85f, 35.13f, 128.0f, 30.91f),
                    PathNode.CurveTo(135.16f, 35.16f, 154.76f, 48.34f, 164.41f, 69.91f),
                    PathNode.CurveTo(147.88405f, 79.67368f, 135.07506f, 94.65679f, 128.0f, 112.5f),
                    PathNode.CurveTo(120.92435f, 94.65409f, 108.111176f, 79.67021f, 91.58f, 69.91f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 144.0f),
                    PathNode.CurveTo(201.954f, 182.52525f, 172.39453f, 214.58858f, 134.0f, 217.76f),
                    PathNode.LineTo(134.0f, 200.0f),
                    PathNode.CurveTo(134.046f, 161.47475f, 163.60547f, 129.41142f, 202.0f, 126.24f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 114.23f),
                    PathNode.CurveTo(173.81487f, 116.224045f, 148.40193f, 131.92027f, 134.0f, 156.23f),
                    PathNode.LineTo(134.0f, 144.0f),
                    PathNode.CurveTo(134.0508f, 105.476616f, 163.60773f, 73.41603f, 202.0f, 70.24f),
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
        return _grains!!
    }

private var _grains: ImageVector? = null

package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cpu: ImageVector
    get() {
        if (_cpu != null) return _cpu!!
        _cpu = phosphorLightIcon(
            name = "Cpu",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 98.0f),
                    PathNode.LineTo(104.0f, 98.0f),
                    PathNode.CurveTo(100.686295f, 98.0f, 98.0f, 100.686295f, 98.0f, 104.0f),
                    PathNode.LineTo(98.0f, 152.0f),
                    PathNode.CurveTo(98.0f, 155.3137f, 100.686295f, 158.0f, 104.0f, 158.0f),
                    PathNode.LineTo(152.0f, 158.0f),
                    PathNode.CurveTo(155.3137f, 158.0f, 158.0f, 155.3137f, 158.0f, 152.0f),
                    PathNode.LineTo(158.0f, 104.0f),
                    PathNode.CurveTo(158.0f, 100.686295f, 155.3137f, 98.0f, 152.0f, 98.0f),
                    PathNode.Close,
                    PathNode.MoveTo(146.0f, 146.0f),
                    PathNode.LineTo(110.0f, 146.0f),
                    PathNode.LineTo(110.0f, 110.0f),
                    PathNode.LineTo(146.0f, 110.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 146.0f),
                    PathNode.LineTo(214.0f, 146.0f),
                    PathNode.LineTo(214.0f, 110.0f),
                    PathNode.LineTo(232.0f, 110.0f),
                    PathNode.CurveTo(235.3137f, 110.0f, 238.0f, 107.313705f, 238.0f, 104.0f),
                    PathNode.CurveTo(238.0f, 100.686295f, 235.3137f, 98.0f, 232.0f, 98.0f),
                    PathNode.LineTo(214.0f, 98.0f),
                    PathNode.LineTo(214.0f, 56.0f),
                    PathNode.CurveTo(214.0f, 48.268013f, 207.73198f, 42.0f, 200.0f, 42.0f),
                    PathNode.LineTo(158.0f, 42.0f),
                    PathNode.LineTo(158.0f, 24.0f),
                    PathNode.CurveTo(158.0f, 20.68629f, 155.3137f, 18.0f, 152.0f, 18.0f),
                    PathNode.CurveTo(148.6863f, 18.0f, 146.0f, 20.68629f, 146.0f, 24.0f),
                    PathNode.LineTo(146.0f, 42.0f),
                    PathNode.LineTo(110.0f, 42.0f),
                    PathNode.LineTo(110.0f, 24.0f),
                    PathNode.CurveTo(110.0f, 20.68629f, 107.313705f, 18.0f, 104.0f, 18.0f),
                    PathNode.CurveTo(100.686295f, 18.0f, 98.0f, 20.68629f, 98.0f, 24.0f),
                    PathNode.LineTo(98.0f, 42.0f),
                    PathNode.LineTo(56.0f, 42.0f),
                    PathNode.CurveTo(48.268013f, 42.0f, 42.0f, 48.268013f, 42.0f, 56.0f),
                    PathNode.LineTo(42.0f, 98.0f),
                    PathNode.LineTo(24.0f, 98.0f),
                    PathNode.CurveTo(20.68629f, 98.0f, 18.0f, 100.686295f, 18.0f, 104.0f),
                    PathNode.CurveTo(18.0f, 107.313705f, 20.68629f, 110.0f, 24.0f, 110.0f),
                    PathNode.LineTo(42.0f, 110.0f),
                    PathNode.LineTo(42.0f, 146.0f),
                    PathNode.LineTo(24.0f, 146.0f),
                    PathNode.CurveTo(20.68629f, 146.0f, 18.0f, 148.6863f, 18.0f, 152.0f),
                    PathNode.CurveTo(18.0f, 155.3137f, 20.68629f, 158.0f, 24.0f, 158.0f),
                    PathNode.LineTo(42.0f, 158.0f),
                    PathNode.LineTo(42.0f, 200.0f),
                    PathNode.CurveTo(42.0f, 207.73198f, 48.268013f, 214.0f, 56.0f, 214.0f),
                    PathNode.LineTo(98.0f, 214.0f),
                    PathNode.LineTo(98.0f, 232.0f),
                    PathNode.CurveTo(98.0f, 235.3137f, 100.686295f, 238.0f, 104.0f, 238.0f),
                    PathNode.CurveTo(107.313705f, 238.0f, 110.0f, 235.3137f, 110.0f, 232.0f),
                    PathNode.LineTo(110.0f, 214.0f),
                    PathNode.LineTo(146.0f, 214.0f),
                    PathNode.LineTo(146.0f, 232.0f),
                    PathNode.CurveTo(146.0f, 235.3137f, 148.6863f, 238.0f, 152.0f, 238.0f),
                    PathNode.CurveTo(155.3137f, 238.0f, 158.0f, 235.3137f, 158.0f, 232.0f),
                    PathNode.LineTo(158.0f, 214.0f),
                    PathNode.LineTo(200.0f, 214.0f),
                    PathNode.CurveTo(207.73198f, 214.0f, 214.0f, 207.73198f, 214.0f, 200.0f),
                    PathNode.LineTo(214.0f, 158.0f),
                    PathNode.LineTo(232.0f, 158.0f),
                    PathNode.CurveTo(235.3137f, 158.0f, 238.0f, 155.3137f, 238.0f, 152.0f),
                    PathNode.CurveTo(238.0f, 148.6863f, 235.3137f, 146.0f, 232.0f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.0f, 200.0f),
                    PathNode.CurveTo(202.0f, 201.10457f, 201.10457f, 202.0f, 200.0f, 202.0f),
                    PathNode.LineTo(56.0f, 202.0f),
                    PathNode.CurveTo(54.89543f, 202.0f, 54.0f, 201.10457f, 54.0f, 200.0f),
                    PathNode.LineTo(54.0f, 56.0f),
                    PathNode.CurveTo(54.0f, 54.89543f, 54.89543f, 54.0f, 56.0f, 54.0f),
                    PathNode.LineTo(200.0f, 54.0f),
                    PathNode.CurveTo(201.10457f, 54.0f, 202.0f, 54.89543f, 202.0f, 56.0f),
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
        return _cpu!!
    }

private var _cpu: ImageVector? = null

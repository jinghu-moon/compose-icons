package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FloppyDiskBack: ImageVector
    get() {
        if (_floppyDiskBack != null) return _floppyDiskBack!!
        _floppyDiskBack = phosphorLightIcon(
            name = "FloppyDiskBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 34.0f),
                    PathNode.LineTo(83.31f, 34.0f),
                    PathNode.CurveTo(79.59555f, 33.993107f, 76.03196f, 35.468937f, 73.41f, 38.1f),
                    PathNode.LineTo(38.1f, 73.41f),
                    PathNode.CurveTo(35.468937f, 76.03196f, 33.993107f, 79.59555f, 34.0f, 83.31f),
                    PathNode.LineTo(34.0f, 208.0f),
                    PathNode.CurveTo(34.0f, 215.73198f, 40.268013f, 222.0f, 48.0f, 222.0f),
                    PathNode.LineTo(208.0f, 222.0f),
                    PathNode.CurveTo(215.73198f, 222.0f, 222.0f, 215.73198f, 222.0f, 208.0f),
                    PathNode.LineTo(222.0f, 48.0f),
                    PathNode.CurveTo(222.0f, 40.268013f, 215.73198f, 34.0f, 208.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(86.0f, 46.0f),
                    PathNode.LineTo(170.0f, 46.0f),
                    PathNode.LineTo(170.0f, 80.0f),
                    PathNode.CurveTo(170.0f, 81.10457f, 169.10457f, 82.0f, 168.0f, 82.0f),
                    PathNode.LineTo(88.0f, 82.0f),
                    PathNode.CurveTo(86.89543f, 82.0f, 86.0f, 81.10457f, 86.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 208.0f),
                    PathNode.CurveTo(210.0f, 209.10457f, 209.10457f, 210.0f, 208.0f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 83.31f),
                    PathNode.CurveTo(46.00223f, 82.780426f, 46.214413f, 82.27335f, 46.59f, 81.9f),
                    PathNode.LineTo(74.0f, 54.48f),
                    PathNode.LineTo(74.0f, 80.0f),
                    PathNode.CurveTo(74.0f, 87.73199f, 80.26801f, 94.0f, 88.0f, 94.0f),
                    PathNode.LineTo(168.0f, 94.0f),
                    PathNode.CurveTo(175.73198f, 94.0f, 182.0f, 87.73199f, 182.0f, 80.0f),
                    PathNode.LineTo(182.0f, 46.0f),
                    PathNode.LineTo(208.0f, 46.0f),
                    PathNode.CurveTo(209.10457f, 46.0f, 210.0f, 46.89543f, 210.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 114.0f),
                    PathNode.CurveTo(107.013176f, 114.0f, 90.0f, 131.01318f, 90.0f, 152.0f),
                    PathNode.CurveTo(90.0f, 172.98682f, 107.013176f, 190.0f, 128.0f, 190.0f),
                    PathNode.CurveTo(148.98682f, 190.0f, 166.0f, 172.98682f, 166.0f, 152.0f),
                    PathNode.CurveTo(166.0f, 131.01318f, 148.98682f, 114.0f, 128.0f, 114.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 178.0f),
                    PathNode.CurveTo(113.640594f, 178.0f, 102.0f, 166.3594f, 102.0f, 152.0f),
                    PathNode.CurveTo(102.0f, 137.6406f, 113.640594f, 126.0f, 128.0f, 126.0f),
                    PathNode.CurveTo(142.3594f, 126.0f, 154.0f, 137.6406f, 154.0f, 152.0f),
                    PathNode.CurveTo(154.0f, 166.3594f, 142.3594f, 178.0f, 128.0f, 178.0f),
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
        return _floppyDiskBack!!
    }

private var _floppyDiskBack: ImageVector? = null

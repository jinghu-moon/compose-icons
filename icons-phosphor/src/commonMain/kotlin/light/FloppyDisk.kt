package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FloppyDisk: ImageVector
    get() {
        if (_floppyDisk != null) return _floppyDisk!!
        _floppyDisk = phosphorLightIcon(
            name = "FloppyDisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(217.9f, 73.42f),
                    PathNode.LineTo(182.58f, 38.1f),
                    PathNode.CurveTo(179.96301f, 35.467636f, 176.40187f, 33.991325f, 172.69f, 34.0f),
                    PathNode.LineTo(48.0f, 34.0f),
                    PathNode.CurveTo(40.268013f, 34.0f, 34.0f, 40.268013f, 34.0f, 48.0f),
                    PathNode.LineTo(34.0f, 208.0f),
                    PathNode.CurveTo(34.0f, 215.73198f, 40.268013f, 222.0f, 48.0f, 222.0f),
                    PathNode.LineTo(208.0f, 222.0f),
                    PathNode.CurveTo(215.73198f, 222.0f, 222.0f, 215.73198f, 222.0f, 208.0f),
                    PathNode.LineTo(222.0f, 83.31f),
                    PathNode.CurveTo(222.00867f, 79.59814f, 220.53236f, 76.036995f, 217.9f, 73.42f),
                    PathNode.Close,
                    PathNode.MoveTo(170.0f, 210.0f),
                    PathNode.LineTo(86.0f, 210.0f),
                    PathNode.LineTo(86.0f, 152.0f),
                    PathNode.CurveTo(86.0f, 150.89543f, 86.89543f, 150.0f, 88.0f, 150.0f),
                    PathNode.LineTo(168.0f, 150.0f),
                    PathNode.CurveTo(169.10457f, 150.0f, 170.0f, 150.89543f, 170.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 208.0f),
                    PathNode.CurveTo(210.0f, 209.10457f, 209.10457f, 210.0f, 208.0f, 210.0f),
                    PathNode.LineTo(182.0f, 210.0f),
                    PathNode.LineTo(182.0f, 152.0f),
                    PathNode.CurveTo(182.0f, 144.26802f, 175.73198f, 138.0f, 168.0f, 138.0f),
                    PathNode.LineTo(88.0f, 138.0f),
                    PathNode.CurveTo(80.26801f, 138.0f, 74.0f, 144.26802f, 74.0f, 152.0f),
                    PathNode.LineTo(74.0f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 48.0f),
                    PathNode.CurveTo(46.0f, 46.89543f, 46.89543f, 46.0f, 48.0f, 46.0f),
                    PathNode.LineTo(172.69f, 46.0f),
                    PathNode.CurveTo(173.21814f, 45.99958f, 173.72502f, 46.20808f, 174.1f, 46.58f),
                    PathNode.LineTo(209.42f, 81.9f),
                    PathNode.CurveTo(209.79192f, 82.27499f, 210.00043f, 82.78185f, 210.0f, 83.31f),
                    PathNode.Close,
                    PathNode.MoveTo(158.0f, 72.0f),
                    PathNode.CurveTo(158.0f, 75.313705f, 155.3137f, 78.0f, 152.0f, 78.0f),
                    PathNode.LineTo(96.0f, 78.0f),
                    PathNode.CurveTo(92.686295f, 78.0f, 90.0f, 75.313705f, 90.0f, 72.0f),
                    PathNode.CurveTo(90.0f, 68.686295f, 92.686295f, 66.0f, 96.0f, 66.0f),
                    PathNode.LineTo(152.0f, 66.0f),
                    PathNode.CurveTo(155.3137f, 66.0f, 158.0f, 68.686295f, 158.0f, 72.0f),
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
        return _floppyDisk!!
    }

private var _floppyDisk: ImageVector? = null

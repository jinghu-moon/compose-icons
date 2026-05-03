package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.HardDrives: ImageVector
    get() {
        if (_hardDrives != null) return _hardDrives!!
        _hardDrives = phosphorLightIcon(
            name = "HardDrives",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 138.0f),
                    PathNode.LineTo(48.0f, 138.0f),
                    PathNode.CurveTo(40.268013f, 138.0f, 34.0f, 144.26802f, 34.0f, 152.0f),
                    PathNode.LineTo(34.0f, 200.0f),
                    PathNode.CurveTo(34.0f, 207.73198f, 40.268013f, 214.0f, 48.0f, 214.0f),
                    PathNode.LineTo(208.0f, 214.0f),
                    PathNode.CurveTo(215.73198f, 214.0f, 222.0f, 207.73198f, 222.0f, 200.0f),
                    PathNode.LineTo(222.0f, 152.0f),
                    PathNode.CurveTo(222.0f, 144.26802f, 215.73198f, 138.0f, 208.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 200.0f),
                    PathNode.CurveTo(210.0f, 201.10457f, 209.10457f, 202.0f, 208.0f, 202.0f),
                    PathNode.LineTo(48.0f, 202.0f),
                    PathNode.CurveTo(46.89543f, 202.0f, 46.0f, 201.10457f, 46.0f, 200.0f),
                    PathNode.LineTo(46.0f, 152.0f),
                    PathNode.CurveTo(46.0f, 150.89543f, 46.89543f, 150.0f, 48.0f, 150.0f),
                    PathNode.LineTo(208.0f, 150.0f),
                    PathNode.CurveTo(209.10457f, 150.0f, 210.0f, 150.89543f, 210.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 42.0f),
                    PathNode.LineTo(48.0f, 42.0f),
                    PathNode.CurveTo(40.268013f, 42.0f, 34.0f, 48.268013f, 34.0f, 56.0f),
                    PathNode.LineTo(34.0f, 104.0f),
                    PathNode.CurveTo(34.0f, 111.73199f, 40.268013f, 118.0f, 48.0f, 118.0f),
                    PathNode.LineTo(208.0f, 118.0f),
                    PathNode.CurveTo(215.73198f, 118.0f, 222.0f, 111.73199f, 222.0f, 104.0f),
                    PathNode.LineTo(222.0f, 56.0f),
                    PathNode.CurveTo(222.0f, 48.268013f, 215.73198f, 42.0f, 208.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(210.0f, 104.0f),
                    PathNode.CurveTo(210.0f, 105.10457f, 209.10457f, 106.0f, 208.0f, 106.0f),
                    PathNode.LineTo(48.0f, 106.0f),
                    PathNode.CurveTo(46.89543f, 106.0f, 46.0f, 105.10457f, 46.0f, 104.0f),
                    PathNode.LineTo(46.0f, 56.0f),
                    PathNode.CurveTo(46.0f, 54.89543f, 46.89543f, 54.0f, 48.0f, 54.0f),
                    PathNode.LineTo(208.0f, 54.0f),
                    PathNode.CurveTo(209.10457f, 54.0f, 210.0f, 54.89543f, 210.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(190.0f, 80.0f),
                    PathNode.CurveTo(190.0f, 85.52285f, 185.52284f, 90.0f, 180.0f, 90.0f),
                    PathNode.CurveTo(174.47716f, 90.0f, 170.0f, 85.52285f, 170.0f, 80.0f),
                    PathNode.CurveTo(170.0f, 74.47715f, 174.47716f, 70.0f, 180.0f, 70.0f),
                    PathNode.CurveTo(185.52284f, 70.0f, 190.0f, 74.47715f, 190.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(190.0f, 176.0f),
                    PathNode.CurveTo(190.0f, 181.52284f, 185.52284f, 186.0f, 180.0f, 186.0f),
                    PathNode.CurveTo(174.47716f, 186.0f, 170.0f, 181.52284f, 170.0f, 176.0f),
                    PathNode.CurveTo(170.0f, 170.47716f, 174.47716f, 166.0f, 180.0f, 166.0f),
                    PathNode.CurveTo(185.52284f, 166.0f, 190.0f, 170.47716f, 190.0f, 176.0f),
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
        return _hardDrives!!
    }

private var _hardDrives: ImageVector? = null

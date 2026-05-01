package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Building: ImageVector
    get() {
        if (_building != null) return _building!!
        _building = phosphorLightIcon(
            name = "Building",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 226.0f),
                    PathNode.LineTo(206.0f, 226.0f),
                    PathNode.LineTo(206.0f, 30.0f),
                    PathNode.LineTo(216.0f, 30.0f),
                    PathNode.CurveTo(219.3137f, 30.0f, 222.0f, 27.31371f, 222.0f, 24.0f),
                    PathNode.CurveTo(222.0f, 20.68629f, 219.3137f, 18.0f, 216.0f, 18.0f),
                    PathNode.LineTo(40.0f, 18.0f),
                    PathNode.CurveTo(36.68629f, 18.0f, 34.0f, 20.68629f, 34.0f, 24.0f),
                    PathNode.CurveTo(34.0f, 27.31371f, 36.68629f, 30.0f, 40.0f, 30.0f),
                    PathNode.LineTo(50.0f, 30.0f),
                    PathNode.LineTo(50.0f, 226.0f),
                    PathNode.LineTo(24.0f, 226.0f),
                    PathNode.CurveTo(20.68629f, 226.0f, 18.0f, 228.6863f, 18.0f, 232.0f),
                    PathNode.CurveTo(18.0f, 235.3137f, 20.68629f, 238.0f, 24.0f, 238.0f),
                    PathNode.LineTo(232.0f, 238.0f),
                    PathNode.CurveTo(235.3137f, 238.0f, 238.0f, 235.3137f, 238.0f, 232.0f),
                    PathNode.CurveTo(238.0f, 228.6863f, 235.3137f, 226.0f, 232.0f, 226.0f),
                    PathNode.Close,
                    PathNode.MoveTo(62.0f, 30.0f),
                    PathNode.LineTo(194.0f, 30.0f),
                    PathNode.LineTo(194.0f, 226.0f),
                    PathNode.LineTo(158.0f, 226.0f),
                    PathNode.LineTo(158.0f, 184.0f),
                    PathNode.CurveTo(158.0f, 180.6863f, 155.3137f, 178.0f, 152.0f, 178.0f),
                    PathNode.LineTo(104.0f, 178.0f),
                    PathNode.CurveTo(100.686295f, 178.0f, 98.0f, 180.6863f, 98.0f, 184.0f),
                    PathNode.LineTo(98.0f, 226.0f),
                    PathNode.LineTo(62.0f, 226.0f),
                    PathNode.Close,
                    PathNode.MoveTo(146.0f, 226.0f),
                    PathNode.LineTo(110.0f, 226.0f),
                    PathNode.LineTo(110.0f, 190.0f),
                    PathNode.LineTo(146.0f, 190.0f),
                    PathNode.Close,
                    PathNode.MoveTo(90.0f, 64.0f),
                    PathNode.CurveTo(90.0f, 60.68629f, 92.686295f, 58.0f, 96.0f, 58.0f),
                    PathNode.LineTo(112.0f, 58.0f),
                    PathNode.CurveTo(115.313705f, 58.0f, 118.0f, 60.68629f, 118.0f, 64.0f),
                    PathNode.CurveTo(118.0f, 67.313705f, 115.313705f, 70.0f, 112.0f, 70.0f),
                    PathNode.LineTo(96.0f, 70.0f),
                    PathNode.CurveTo(92.686295f, 70.0f, 90.0f, 67.313705f, 90.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.0f, 64.0f),
                    PathNode.CurveTo(138.0f, 60.68629f, 140.6863f, 58.0f, 144.0f, 58.0f),
                    PathNode.LineTo(160.0f, 58.0f),
                    PathNode.CurveTo(163.3137f, 58.0f, 166.0f, 60.68629f, 166.0f, 64.0f),
                    PathNode.CurveTo(166.0f, 67.313705f, 163.3137f, 70.0f, 160.0f, 70.0f),
                    PathNode.LineTo(144.0f, 70.0f),
                    PathNode.CurveTo(140.6863f, 70.0f, 138.0f, 67.313705f, 138.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(90.0f, 104.0f),
                    PathNode.CurveTo(90.0f, 100.686295f, 92.686295f, 98.0f, 96.0f, 98.0f),
                    PathNode.LineTo(112.0f, 98.0f),
                    PathNode.CurveTo(115.313705f, 98.0f, 118.0f, 100.686295f, 118.0f, 104.0f),
                    PathNode.CurveTo(118.0f, 107.313705f, 115.313705f, 110.0f, 112.0f, 110.0f),
                    PathNode.LineTo(96.0f, 110.0f),
                    PathNode.CurveTo(92.686295f, 110.0f, 90.0f, 107.313705f, 90.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.0f, 104.0f),
                    PathNode.CurveTo(138.0f, 100.686295f, 140.6863f, 98.0f, 144.0f, 98.0f),
                    PathNode.LineTo(160.0f, 98.0f),
                    PathNode.CurveTo(163.3137f, 98.0f, 166.0f, 100.686295f, 166.0f, 104.0f),
                    PathNode.CurveTo(166.0f, 107.313705f, 163.3137f, 110.0f, 160.0f, 110.0f),
                    PathNode.LineTo(144.0f, 110.0f),
                    PathNode.CurveTo(140.6863f, 110.0f, 138.0f, 107.313705f, 138.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 150.0f),
                    PathNode.CurveTo(92.686295f, 150.0f, 90.0f, 147.3137f, 90.0f, 144.0f),
                    PathNode.CurveTo(90.0f, 140.6863f, 92.686295f, 138.0f, 96.0f, 138.0f),
                    PathNode.LineTo(112.0f, 138.0f),
                    PathNode.CurveTo(115.313705f, 138.0f, 118.0f, 140.6863f, 118.0f, 144.0f),
                    PathNode.CurveTo(118.0f, 147.3137f, 115.313705f, 150.0f, 112.0f, 150.0f),
                    PathNode.Close,
                    PathNode.MoveTo(138.0f, 144.0f),
                    PathNode.CurveTo(138.0f, 140.6863f, 140.6863f, 138.0f, 144.0f, 138.0f),
                    PathNode.LineTo(160.0f, 138.0f),
                    PathNode.CurveTo(163.3137f, 138.0f, 166.0f, 140.6863f, 166.0f, 144.0f),
                    PathNode.CurveTo(166.0f, 147.3137f, 163.3137f, 150.0f, 160.0f, 150.0f),
                    PathNode.LineTo(144.0f, 150.0f),
                    PathNode.CurveTo(140.6863f, 150.0f, 138.0f, 147.3137f, 138.0f, 144.0f),
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
        return _building!!
    }

private var _building: ImageVector? = null

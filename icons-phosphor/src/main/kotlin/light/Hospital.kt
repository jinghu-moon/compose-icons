package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Hospital: ImageVector
    get() {
        if (_hospital != null) return _hospital!!
        _hospital = phosphorLightIcon(
            name = "Hospital",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 210.0f),
                    PathNode.LineTo(238.0f, 210.0f),
                    PathNode.LineTo(238.0f, 128.0f),
                    PathNode.CurveTo(238.0f, 120.26801f, 231.73198f, 114.0f, 224.0f, 114.0f),
                    PathNode.LineTo(166.0f, 114.0f),
                    PathNode.LineTo(166.0f, 48.0f),
                    PathNode.CurveTo(166.0f, 40.268013f, 159.73198f, 34.0f, 152.0f, 34.0f),
                    PathNode.LineTo(56.0f, 34.0f),
                    PathNode.CurveTo(48.268013f, 34.0f, 42.0f, 40.268013f, 42.0f, 48.0f),
                    PathNode.LineTo(42.0f, 210.0f),
                    PathNode.LineTo(32.0f, 210.0f),
                    PathNode.CurveTo(28.68629f, 210.0f, 26.0f, 212.6863f, 26.0f, 216.0f),
                    PathNode.CurveTo(26.0f, 219.3137f, 28.68629f, 222.0f, 32.0f, 222.0f),
                    PathNode.LineTo(248.0f, 222.0f),
                    PathNode.CurveTo(251.3137f, 222.0f, 254.0f, 219.3137f, 254.0f, 216.0f),
                    PathNode.CurveTo(254.0f, 212.6863f, 251.3137f, 210.0f, 248.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 126.0f),
                    PathNode.CurveTo(225.10457f, 126.0f, 226.0f, 126.89543f, 226.0f, 128.0f),
                    PathNode.LineTo(226.0f, 210.0f),
                    PathNode.LineTo(166.0f, 210.0f),
                    PathNode.LineTo(166.0f, 126.0f),
                    PathNode.Close,
                    PathNode.MoveTo(54.0f, 48.0f),
                    PathNode.CurveTo(54.0f, 46.89543f, 54.89543f, 46.0f, 56.0f, 46.0f),
                    PathNode.LineTo(152.0f, 46.0f),
                    PathNode.CurveTo(153.10457f, 46.0f, 154.0f, 46.89543f, 154.0f, 48.0f),
                    PathNode.LineTo(154.0f, 210.0f),
                    PathNode.LineTo(134.0f, 210.0f),
                    PathNode.LineTo(134.0f, 160.0f),
                    PathNode.CurveTo(134.0f, 156.6863f, 131.3137f, 154.0f, 128.0f, 154.0f),
                    PathNode.LineTo(80.0f, 154.0f),
                    PathNode.CurveTo(76.686295f, 154.0f, 74.0f, 156.6863f, 74.0f, 160.0f),
                    PathNode.LineTo(74.0f, 210.0f),
                    PathNode.LineTo(54.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(122.0f, 210.0f),
                    PathNode.LineTo(86.0f, 210.0f),
                    PathNode.LineTo(86.0f, 166.0f),
                    PathNode.LineTo(122.0f, 166.0f),
                    PathNode.Close,
                    PathNode.MoveTo(74.0f, 96.0f),
                    PathNode.CurveTo(74.0f, 92.686295f, 76.686295f, 90.0f, 80.0f, 90.0f),
                    PathNode.LineTo(98.0f, 90.0f),
                    PathNode.LineTo(98.0f, 72.0f),
                    PathNode.CurveTo(98.0f, 68.686295f, 100.686295f, 66.0f, 104.0f, 66.0f),
                    PathNode.CurveTo(107.313705f, 66.0f, 110.0f, 68.686295f, 110.0f, 72.0f),
                    PathNode.LineTo(110.0f, 90.0f),
                    PathNode.LineTo(128.0f, 90.0f),
                    PathNode.CurveTo(131.3137f, 90.0f, 134.0f, 92.686295f, 134.0f, 96.0f),
                    PathNode.CurveTo(134.0f, 99.313705f, 131.3137f, 102.0f, 128.0f, 102.0f),
                    PathNode.LineTo(110.0f, 102.0f),
                    PathNode.LineTo(110.0f, 120.0f),
                    PathNode.CurveTo(110.0f, 123.313705f, 107.313705f, 126.0f, 104.0f, 126.0f),
                    PathNode.CurveTo(100.686295f, 126.0f, 98.0f, 123.313705f, 98.0f, 120.0f),
                    PathNode.LineTo(98.0f, 102.0f),
                    PathNode.LineTo(80.0f, 102.0f),
                    PathNode.CurveTo(76.686295f, 102.0f, 74.0f, 99.313705f, 74.0f, 96.0f),
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
        return _hospital!!
    }

private var _hospital: ImageVector? = null

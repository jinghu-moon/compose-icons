package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BracketsCurly: ImageVector
    get() {
        if (_bracketsCurly != null) return _bracketsCurly!!
        _bracketsCurly = phosphorLightIcon(
            name = "BracketsCurly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(39.91f, 128.0f),
                    PathNode.CurveTo(44.014057f, 130.79199f, 47.291832f, 134.63622f, 49.4f, 139.13f),
                    PathNode.CurveTo(54.0f, 148.62f, 54.0f, 160.51f, 54.0f, 172.0f),
                    PathNode.CurveTo(54.0f, 196.27f, 55.21f, 210.0f, 80.0f, 210.0f),
                    PathNode.CurveTo(83.313705f, 210.0f, 86.0f, 212.6863f, 86.0f, 216.0f),
                    PathNode.CurveTo(86.0f, 219.3137f, 83.313705f, 222.0f, 80.0f, 222.0f),
                    PathNode.CurveTo(63.12f, 222.0f, 52.19f, 216.4f, 46.6f, 204.87f),
                    PathNode.CurveTo(42.0f, 195.38f, 42.0f, 183.49f, 42.0f, 172.0f),
                    PathNode.CurveTo(42.0f, 147.73f, 40.79f, 134.0f, 16.0f, 134.0f),
                    PathNode.CurveTo(12.686292f, 134.0f, 10.0f, 131.3137f, 10.0f, 128.0f),
                    PathNode.CurveTo(10.0f, 124.686295f, 12.686292f, 122.0f, 16.0f, 122.0f),
                    PathNode.CurveTo(40.79f, 122.0f, 42.0f, 108.27f, 42.0f, 84.0f),
                    PathNode.CurveTo(42.0f, 72.51f, 42.0f, 60.62f, 46.6f, 51.13f),
                    PathNode.CurveTo(52.19f, 39.6f, 63.12f, 34.0f, 80.0f, 34.0f),
                    PathNode.CurveTo(83.313705f, 34.0f, 86.0f, 36.68629f, 86.0f, 40.0f),
                    PathNode.CurveTo(86.0f, 43.31371f, 83.313705f, 46.0f, 80.0f, 46.0f),
                    PathNode.CurveTo(55.21f, 46.0f, 54.0f, 59.73f, 54.0f, 84.0f),
                    PathNode.CurveTo(54.0f, 95.49f, 54.0f, 107.38f, 49.4f, 116.87f),
                    PathNode.CurveTo(47.291832f, 121.36379f, 44.014057f, 125.20801f, 39.91f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 122.0f),
                    PathNode.CurveTo(215.21f, 122.0f, 214.0f, 108.27f, 214.0f, 84.0f),
                    PathNode.CurveTo(214.0f, 72.51f, 214.0f, 60.62f, 209.4f, 51.13f),
                    PathNode.CurveTo(203.81f, 39.6f, 192.88f, 34.0f, 176.0f, 34.0f),
                    PathNode.CurveTo(172.6863f, 34.0f, 170.0f, 36.68629f, 170.0f, 40.0f),
                    PathNode.CurveTo(170.0f, 43.31371f, 172.6863f, 46.0f, 176.0f, 46.0f),
                    PathNode.CurveTo(200.79f, 46.0f, 202.0f, 59.73f, 202.0f, 84.0f),
                    PathNode.CurveTo(202.0f, 95.49f, 202.0f, 107.38f, 206.6f, 116.87f),
                    PathNode.CurveTo(208.70818f, 121.36379f, 211.98595f, 125.20801f, 216.09f, 128.0f),
                    PathNode.CurveTo(211.98595f, 130.79199f, 208.70818f, 134.63622f, 206.6f, 139.13f),
                    PathNode.CurveTo(202.0f, 148.62f, 202.0f, 160.51f, 202.0f, 172.0f),
                    PathNode.CurveTo(202.0f, 196.27f, 200.79f, 210.0f, 176.0f, 210.0f),
                    PathNode.CurveTo(172.6863f, 210.0f, 170.0f, 212.6863f, 170.0f, 216.0f),
                    PathNode.CurveTo(170.0f, 219.3137f, 172.6863f, 222.0f, 176.0f, 222.0f),
                    PathNode.CurveTo(192.88f, 222.0f, 203.81f, 216.4f, 209.4f, 204.87f),
                    PathNode.CurveTo(214.0f, 195.38f, 214.0f, 183.49f, 214.0f, 172.0f),
                    PathNode.CurveTo(214.0f, 147.73f, 215.21f, 134.0f, 240.0f, 134.0f),
                    PathNode.CurveTo(243.3137f, 134.0f, 246.0f, 131.3137f, 246.0f, 128.0f),
                    PathNode.CurveTo(246.0f, 124.686295f, 243.3137f, 122.0f, 240.0f, 122.0f),
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
        return _bracketsCurly!!
    }

private var _bracketsCurly: ImageVector? = null

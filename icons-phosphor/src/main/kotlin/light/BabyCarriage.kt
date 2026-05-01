package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.BabyCarriage: ImageVector
    get() {
        if (_babyCarriage != null) return _babyCarriage!!
        _babyCarriage = phosphorLightIcon(
            name = "BabyCarriage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 34.0f),
                    PathNode.LineTo(152.0f, 34.0f),
                    PathNode.CurveTo(144.26802f, 34.0f, 138.0f, 40.268013f, 138.0f, 48.0f),
                    PathNode.LineTo(138.0f, 106.0f),
                    PathNode.LineTo(53.52f, 106.0f),
                    PathNode.CurveTo(50.55278f, 87.575714f, 34.661674f, 74.02254f, 16.0f, 74.0f),
                    PathNode.CurveTo(12.686292f, 74.0f, 10.0f, 76.686295f, 10.0f, 80.0f),
                    PathNode.CurveTo(10.0f, 83.313705f, 12.686292f, 86.0f, 16.0f, 86.0f),
                    PathNode.CurveTo(30.359404f, 86.0f, 42.0f, 97.640594f, 42.0f, 112.0f),
                    PathNode.CurveTo(42.049595f, 155.05765f, 76.94235f, 189.95041f, 120.0f, 190.0f),
                    PathNode.LineTo(160.0f, 190.0f),
                    PathNode.CurveTo(203.07822f, 190.0f, 238.0f, 155.07822f, 238.0f, 112.0f),
                    PathNode.CurveTo(238.0f, 68.92179f, 203.07822f, 34.0f, 160.0f, 34.0f),
                    PathNode.Close,
                    PathNode.MoveTo(225.71f, 106.0f),
                    PathNode.LineTo(161.1f, 106.0f),
                    PathNode.LineTo(208.92f, 67.75f),
                    PathNode.CurveTo(218.53134f, 78.332275f, 224.42647f, 91.7622f, 225.71f, 106.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 46.0f),
                    PathNode.LineTo(160.0f, 46.0f),
                    PathNode.CurveTo(174.45926f, 45.9834f, 188.51979f, 50.739372f, 200.0f, 59.53f),
                    PathNode.LineTo(150.0f, 99.53f),
                    PathNode.LineTo(150.0f, 48.0f),
                    PathNode.CurveTo(150.0f, 46.89543f, 150.89543f, 46.0f, 152.0f, 46.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 178.0f),
                    PathNode.LineTo(120.0f, 178.0f),
                    PathNode.CurveTo(85.88927f, 177.95934f, 57.41318f, 151.96564f, 54.27f, 118.0f),
                    PathNode.LineTo(225.73f, 118.0f),
                    PathNode.CurveTo(222.58682f, 151.96564f, 194.11073f, 177.95934f, 160.0f, 178.0f),
                    PathNode.Close,
                    PathNode.MoveTo(102.0f, 224.0f),
                    PathNode.CurveTo(102.0f, 231.73198f, 95.73199f, 238.0f, 88.0f, 238.0f),
                    PathNode.CurveTo(80.26801f, 238.0f, 74.0f, 231.73198f, 74.0f, 224.0f),
                    PathNode.CurveTo(74.0f, 216.26802f, 80.26801f, 210.0f, 88.0f, 210.0f),
                    PathNode.CurveTo(95.73199f, 210.0f, 102.0f, 216.26802f, 102.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(206.0f, 224.0f),
                    PathNode.CurveTo(206.0f, 231.73198f, 199.73198f, 238.0f, 192.0f, 238.0f),
                    PathNode.CurveTo(184.26802f, 238.0f, 178.0f, 231.73198f, 178.0f, 224.0f),
                    PathNode.CurveTo(178.0f, 216.26802f, 184.26802f, 210.0f, 192.0f, 210.0f),
                    PathNode.CurveTo(199.73198f, 210.0f, 206.0f, 216.26802f, 206.0f, 224.0f),
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
        return _babyCarriage!!
    }

private var _babyCarriage: ImageVector? = null

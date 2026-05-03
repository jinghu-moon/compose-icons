package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) return _paperPlane!!
        _paperPlane = phosphorFillIcon(
            name = "PaperPlane",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.2f, 218.31f),
                    PathNode.CurveTo(233.17818f, 221.92178f, 228.70918f, 224.0061f, 224.0f, 224.0f),
                    PathNode.CurveTo(222.17093f, 223.9983f, 220.35533f, 223.68724f, 218.63f, 223.08f),
                    PathNode.LineTo(138.68f, 196.08f),
                    PathNode.CurveTo(137.05424f, 195.53088f, 135.95985f, 194.00598f, 135.96f, 192.29f),
                    PathNode.LineTo(135.96f, 120.0f),
                    PathNode.CurveTo(135.96487f, 117.783165f, 135.04965f, 115.6637f, 133.4327f, 114.147194f),
                    PathNode.CurveTo(131.81572f, 112.63069f, 129.64197f, 111.85313f, 127.43f, 112.0f),
                    PathNode.CurveTo(123.16309f, 112.37623f, 119.90684f, 115.97687f, 119.96f, 120.26f),
                    PathNode.LineTo(119.96f, 192.26f),
                    PathNode.CurveTo(119.960144f, 193.97598f, 118.86575f, 195.50089f, 117.24f, 196.05f),
                    PathNode.LineTo(37.29f, 223.05f),
                    PathNode.CurveTo(31.009691f, 225.25662f, 24.019255f, 223.34425f, 19.73679f, 218.24799f),
                    PathNode.CurveTo(15.454326f, 213.15172f, 14.774609f, 205.93637f, 18.03f, 200.13f),
                    PathNode.LineTo(114.0f, 32.13f),
                    PathNode.CurveTo(116.833954f, 27.092176f, 122.16478f, 23.97455f, 127.945f, 23.97455f),
                    PathNode.CurveTo(133.72522f, 23.97455f, 139.05605f, 27.092176f, 141.89f, 32.13f),
                    PathNode.LineTo(237.9f, 200.1f),
                    PathNode.CurveTo(241.23349f, 205.92043f, 240.55324f, 213.20718f, 236.2f, 218.31f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null

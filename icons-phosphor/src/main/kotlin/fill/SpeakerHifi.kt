package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpeakerHifi: ImageVector
    get() {
        if (_speakerHifi != null) return _speakerHifi!!
        _speakerHifi = phosphorFillIcon(
            name = "SpeakerHifi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 160.0f),
                    PathNode.CurveTo(152.0f, 173.25484f, 141.25484f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(114.74516f, 184.0f, 104.0f, 173.25484f, 104.0f, 160.0f),
                    PathNode.CurveTo(104.0f, 146.74516f, 114.74516f, 136.0f, 128.0f, 136.0f),
                    PathNode.CurveTo(141.25484f, 136.0f, 152.0f, 146.74516f, 152.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 40.0f),
                    PathNode.LineTo(208.0f, 216.0f),
                    PathNode.CurveTo(208.0f, 224.83656f, 200.83656f, 232.0f, 192.0f, 232.0f),
                    PathNode.LineTo(64.0f, 232.0f),
                    PathNode.CurveTo(55.163445f, 232.0f, 48.0f, 224.83656f, 48.0f, 216.0f),
                    PathNode.LineTo(48.0f, 40.0f),
                    PathNode.CurveTo(48.0f, 31.163445f, 55.163445f, 24.0f, 64.0f, 24.0f),
                    PathNode.LineTo(192.0f, 24.0f),
                    PathNode.CurveTo(200.83656f, 24.0f, 208.0f, 31.163445f, 208.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 68.0f),
                    PathNode.CurveTo(116.0f, 74.62742f, 121.37258f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(134.62741f, 80.0f, 140.0f, 74.62742f, 140.0f, 68.0f),
                    PathNode.CurveTo(140.0f, 61.37258f, 134.62741f, 56.0f, 128.0f, 56.0f),
                    PathNode.CurveTo(121.37258f, 56.0f, 116.0f, 61.37258f, 116.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 160.0f),
                    PathNode.CurveTo(168.0f, 137.90862f, 150.09138f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(105.90861f, 120.0f, 88.0f, 137.90862f, 88.0f, 160.0f),
                    PathNode.CurveTo(88.0f, 182.09138f, 105.90861f, 200.0f, 128.0f, 200.0f),
                    PathNode.CurveTo(150.09138f, 200.0f, 168.0f, 182.09138f, 168.0f, 160.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _speakerHifi!!
    }

private var _speakerHifi: ImageVector? = null

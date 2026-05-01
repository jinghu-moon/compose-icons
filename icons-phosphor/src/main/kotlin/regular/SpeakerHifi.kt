package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SpeakerHifi: ImageVector
    get() {
        if (_speakerHifi != null) return _speakerHifi!!
        _speakerHifi = phosphorRegularIcon(
            name = "SpeakerHifi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 24.0f),
                    PathNode.LineTo(64.0f, 24.0f),
                    PathNode.CurveTo(55.163445f, 24.0f, 48.0f, 31.163445f, 48.0f, 40.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.CurveTo(48.0f, 224.83656f, 55.163445f, 232.0f, 64.0f, 232.0f),
                    PathNode.LineTo(192.0f, 232.0f),
                    PathNode.CurveTo(200.83656f, 232.0f, 208.0f, 224.83656f, 208.0f, 216.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(208.0f, 31.163445f, 200.83656f, 24.0f, 192.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 216.0f),
                    PathNode.LineTo(64.0f, 216.0f),
                    PathNode.LineTo(64.0f, 40.0f),
                    PathNode.LineTo(192.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 76.0f),
                    PathNode.CurveTo(116.0f, 69.37258f, 121.37258f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(134.62741f, 64.0f, 140.0f, 69.37258f, 140.0f, 76.0f),
                    PathNode.CurveTo(140.0f, 82.62742f, 134.62741f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(121.37258f, 88.0f, 116.0f, 82.62742f, 116.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 192.0f),
                    PathNode.CurveTo(150.09138f, 192.0f, 168.0f, 174.09138f, 168.0f, 152.0f),
                    PathNode.CurveTo(168.0f, 129.90862f, 150.09138f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(105.90861f, 112.0f, 88.0f, 129.90862f, 88.0f, 152.0f),
                    PathNode.CurveTo(88.0f, 174.09138f, 105.90861f, 192.0f, 128.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 128.0f),
                    PathNode.CurveTo(141.25484f, 128.0f, 152.0f, 138.74516f, 152.0f, 152.0f),
                    PathNode.CurveTo(152.0f, 165.25484f, 141.25484f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(114.74516f, 176.0f, 104.0f, 165.25484f, 104.0f, 152.0f),
                    PathNode.CurveTo(104.0f, 138.74516f, 114.74516f, 128.0f, 128.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _speakerHifi!!
    }

private var _speakerHifi: ImageVector? = null

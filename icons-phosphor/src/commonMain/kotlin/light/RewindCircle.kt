package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.RewindCircle: ImageVector
    get() {
        if (_rewindCircle != null) return _rewindCircle!!
        _rewindCircle = phosphorLightIcon(
            name = "RewindCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(78.29437f, 218.0f, 38.0f, 177.70563f, 38.0f, 128.0f),
                    PathNode.CurveTo(38.0f, 78.29437f, 78.29437f, 38.0f, 128.0f, 38.0f),
                    PathNode.CurveTo(177.70563f, 38.0f, 218.0f, 78.29437f, 218.0f, 128.0f),
                    PathNode.CurveTo(217.94489f, 177.68279f, 177.68279f, 217.94489f, 128.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(174.68f, 86.63f),
                    PathNode.CurveTo(172.64752f, 85.616f, 170.21669f, 85.836624f, 168.4f, 87.2f),
                    PathNode.LineTo(122.0f, 122.0f),
                    PathNode.LineTo(122.0f, 92.0f),
                    PathNode.CurveTo(122.0f, 89.72737f, 120.715996f, 87.64978f, 118.68328f, 86.63344f),
                    PathNode.CurveTo(116.65057f, 85.61709f, 114.21811f, 85.83642f, 112.4f, 87.2f),
                    PathNode.LineTo(64.4f, 123.2f),
                    PathNode.CurveTo(62.889164f, 124.33313f, 62.0f, 126.11146f, 62.0f, 128.0f),
                    PathNode.CurveTo(62.0f, 129.88855f, 62.889164f, 131.66687f, 64.4f, 132.8f),
                    PathNode.LineTo(112.4f, 168.8f),
                    PathNode.CurveTo(114.21811f, 170.16357f, 116.65057f, 170.38292f, 118.68328f, 169.36656f),
                    PathNode.CurveTo(120.715996f, 168.3502f, 122.0f, 166.27263f, 122.0f, 164.0f),
                    PathNode.LineTo(122.0f, 134.0f),
                    PathNode.LineTo(168.4f, 168.8f),
                    PathNode.CurveTo(170.21811f, 170.16357f, 172.65057f, 170.38292f, 174.68329f, 169.36656f),
                    PathNode.CurveTo(176.71599f, 168.3502f, 178.0f, 166.27263f, 178.0f, 164.0f),
                    PathNode.LineTo(178.0f, 92.0f),
                    PathNode.CurveTo(178.00069f, 89.725395f, 176.71509f, 87.64599f, 174.68f, 86.63f),
                    PathNode.Close,
                    PathNode.MoveTo(110.0f, 152.0f),
                    PathNode.LineTo(78.0f, 128.0f),
                    PathNode.LineTo(110.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(166.0f, 152.0f),
                    PathNode.LineTo(134.0f, 128.0f),
                    PathNode.LineTo(166.0f, 104.0f),
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
        return _rewindCircle!!
    }

private var _rewindCircle: ImageVector? = null

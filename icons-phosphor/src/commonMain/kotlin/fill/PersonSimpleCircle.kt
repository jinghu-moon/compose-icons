package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PersonSimpleCircle: ImageVector
    get() {
        if (_personSimpleCircle != null) return _personSimpleCircle!!
        _personSimpleCircle = phosphorFillIcon(
            name = "PersonSimpleCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 64.0f),
                    PathNode.CurveTo(136.83656f, 64.0f, 144.0f, 71.163445f, 144.0f, 80.0f),
                    PathNode.CurveTo(144.0f, 88.836555f, 136.83656f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(119.163445f, 96.0f, 112.0f, 88.836555f, 112.0f, 80.0f),
                    PathNode.CurveTo(112.0f, 71.163445f, 119.163445f, 64.0f, 128.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 120.0f),
                    PathNode.LineTo(136.0f, 120.0f),
                    PathNode.LineTo(136.0f, 133.58f),
                    PathNode.LineTo(166.66f, 179.58f),
                    PathNode.CurveTo(169.11214f, 183.25821f, 168.11821f, 188.22786f, 164.44f, 190.68f),
                    PathNode.CurveTo(160.76178f, 193.13214f, 155.79214f, 192.13821f, 153.34f, 188.46f),
                    PathNode.LineTo(128.0f, 150.46f),
                    PathNode.LineTo(102.66f, 188.46f),
                    PathNode.CurveTo(100.207855f, 192.13821f, 95.23822f, 193.13214f, 91.56f, 190.68f),
                    PathNode.CurveTo(87.88178f, 188.22786f, 86.887856f, 183.25821f, 89.34f, 179.58f),
                    PathNode.LineTo(120.0f, 133.58f),
                    PathNode.LineTo(120.0f, 120.0f),
                    PathNode.LineTo(80.0f, 120.0f),
                    PathNode.CurveTo(75.58172f, 120.0f, 72.0f, 116.41828f, 72.0f, 112.0f),
                    PathNode.CurveTo(72.0f, 107.58172f, 75.58172f, 104.0f, 80.0f, 104.0f),
                    PathNode.LineTo(176.0f, 104.0f),
                    PathNode.CurveTo(180.41827f, 104.0f, 184.0f, 107.58172f, 184.0f, 112.0f),
                    PathNode.CurveTo(184.0f, 116.41828f, 180.41827f, 120.0f, 176.0f, 120.0f),
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
        return _personSimpleCircle!!
    }

private var _personSimpleCircle: ImageVector? = null

package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatTeardropSlash: ImageVector
    get() {
        if (_chatTeardropSlash != null) return _chatTeardropSlash!!
        _chatTeardropSlash = phosphorLightIcon(
            name = "ChatTeardropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(52.44f, 36.0f),
                    PathNode.CurveTo(50.163273f, 33.886772f, 46.65007f, 33.860672f, 44.342197f, 35.93984f),
                    PathNode.CurveTo(42.03432f, 38.019005f, 41.69497f, 41.515873f, 43.56f, 44.0f),
                    PathNode.LineTo(57.93f, 59.8f),
                    PathNode.CurveTo(42.442986f, 77.59658f, 33.940063f, 100.408424f, 34.0f, 124.0f),
                    PathNode.LineTo(34.0f, 208.0f),
                    PathNode.CurveTo(34.0f, 215.73198f, 40.268013f, 222.0f, 48.0f, 222.0f),
                    PathNode.LineTo(132.0f, 222.0f),
                    PathNode.CurveTo(152.3666f, 221.97632f, 172.22238f, 215.6233f, 188.82f, 203.82f),
                    PathNode.LineTo(203.56f, 220.0f),
                    PathNode.CurveTo(205.79123f, 222.45215f, 209.58786f, 222.63123f, 212.04f, 220.4f),
                    PathNode.CurveTo(214.49214f, 218.16876f, 214.67123f, 214.37215f, 212.44f, 211.92f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 210.0f),
                    PathNode.LineTo(48.0f, 210.0f),
                    PathNode.CurveTo(46.89543f, 210.0f, 46.0f, 209.10457f, 46.0f, 208.0f),
                    PathNode.LineTo(46.0f, 124.0f),
                    PathNode.CurveTo(45.961094f, 103.80544f, 53.074898f, 84.24956f, 66.08f, 68.8f),
                    PathNode.LineTo(180.7f, 194.88f),
                    PathNode.CurveTo(166.39923f, 204.7906f, 149.39906f, 210.06866f, 132.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(230.0f, 124.0f),
                    PathNode.CurveTo(230.01303f, 141.83606f, 225.15121f, 159.33652f, 215.94f, 174.61f),
                    PathNode.CurveTo(214.85152f, 176.41377f, 212.89673f, 177.51453f, 210.79f, 177.51f),
                    PathNode.CurveTo(208.62871f, 177.50385f, 206.63776f, 176.33575f, 205.57796f, 174.45213f),
                    PathNode.CurveTo(204.51816f, 172.56851f, 204.55331f, 170.26047f, 205.67f, 168.41f),
                    PathNode.CurveTo(225.36186f, 135.85065f, 221.31647f, 94.22125f, 195.72426f, 66.06243f),
                    PathNode.CurveTo(170.13205f, 37.90361f, 129.0775f, 29.910074f, 94.79f, 46.41f),
                    PathNode.CurveTo(92.84976f, 47.408367f, 90.52047f, 47.27469f, 88.70719f, 46.060905f),
                    PathNode.CurveTo(86.893906f, 44.84713f, 85.88252f, 42.74461f, 86.06602f, 40.57031f),
                    PathNode.CurveTo(86.249504f, 38.396008f, 87.598946f, 36.49273f, 89.59f, 35.6f),
                    PathNode.CurveTo(102.81906f, 29.2348f, 117.31934f, 25.952492f, 132.0f, 26.0f),
                    PathNode.CurveTo(186.09877f, 26.060621f, 229.93938f, 69.90122f, 230.0f, 124.0f),
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
        return _chatTeardropSlash!!
    }

private var _chatTeardropSlash: ImageVector? = null

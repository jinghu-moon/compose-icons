package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SmileySad: ImageVector
    get() {
        if (_smileySad != null) return _smileySad!!
        _smileySad = phosphorFillIcon(
            name = "SmileySad",
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
                    PathNode.MoveTo(92.0f, 96.0f),
                    PathNode.CurveTo(98.62742f, 96.0f, 104.0f, 101.37258f, 104.0f, 108.0f),
                    PathNode.CurveTo(104.0f, 114.62742f, 98.62742f, 120.0f, 92.0f, 120.0f),
                    PathNode.CurveTo(85.37258f, 120.0f, 80.0f, 114.62742f, 80.0f, 108.0f),
                    PathNode.CurveTo(80.0f, 101.37258f, 85.37258f, 96.0f, 92.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 182.92f),
                    PathNode.CurveTo(168.17763f, 185.12494f, 163.29172f, 183.81845f, 161.08f, 180.0f),
                    PathNode.CurveTo(153.61f, 167.09f, 141.87f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(114.13f, 160.0f, 102.39f, 167.1f, 94.92f, 180.0f),
                    PathNode.CurveTo(93.5579f, 182.60382f, 90.87791f, 184.2513f, 87.9396f, 184.29108f),
                    PathNode.CurveTo(85.00129f, 184.33084f, 82.277695f, 182.75652f, 80.84562f, 180.1905f),
                    PathNode.CurveTo(79.413536f, 177.6245f, 79.503525f, 174.47992f, 81.08f, 172.0f),
                    PathNode.CurveTo(91.37f, 154.21f, 108.47f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(147.53f, 144.0f, 164.63f, 154.2f, 174.92f, 172.0f),
                    PathNode.CurveTo(177.12494f, 175.82237f, 175.81845f, 180.70828f, 172.0f, 182.92f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 120.0f),
                    PathNode.CurveTo(157.37259f, 120.0f, 152.0f, 114.62742f, 152.0f, 108.0f),
                    PathNode.CurveTo(152.0f, 101.37258f, 157.37259f, 96.0f, 164.0f, 96.0f),
                    PathNode.CurveTo(170.62741f, 96.0f, 176.0f, 101.37258f, 176.0f, 108.0f),
                    PathNode.CurveTo(176.0f, 114.62742f, 170.62741f, 120.0f, 164.0f, 120.0f),
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
        return _smileySad!!
    }

private var _smileySad: ImageVector? = null

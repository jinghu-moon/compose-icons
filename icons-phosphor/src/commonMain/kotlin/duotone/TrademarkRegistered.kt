package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TrademarkRegistered: ImageVector
    get() {
        if (_trademarkRegistered != null) return _trademarkRegistered!!
        _trademarkRegistered = phosphorDuotoneIcon(
            name = "TrademarkRegistered",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 181.01933f, 181.01933f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(74.98067f, 224.0f, 32.0f, 181.01933f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 74.98067f, 74.98067f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(181.01933f, 32.0f, 224.0f, 74.98067f, 224.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 216.0f),
                    PathNode.CurveTo(79.39894f, 216.0f, 40.0f, 176.60106f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 79.39894f, 79.39894f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(176.60106f, 40.0f, 216.0f, 79.39894f, 216.0f, 128.0f),
                    PathNode.CurveTo(215.94489f, 176.57822f, 176.57822f, 215.94489f, 128.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(151.09f, 140.21f),
                    PathNode.CurveTo(164.0232f, 133.28442f, 170.59038f, 118.451294f, 167.02386f, 104.220665f),
                    PathNode.CurveTo(163.45734f, 89.99003f, 150.67075f, 80.0074f, 136.0f, 80.0f),
                    PathNode.LineTo(104.0f, 80.0f),
                    PathNode.CurveTo(99.58172f, 80.0f, 96.0f, 83.58172f, 96.0f, 88.0f),
                    PathNode.LineTo(96.0f, 168.0f),
                    PathNode.CurveTo(96.0f, 172.41827f, 99.58172f, 176.0f, 104.0f, 176.0f),
                    PathNode.CurveTo(108.41828f, 176.0f, 112.0f, 172.41827f, 112.0f, 168.0f),
                    PathNode.LineTo(112.0f, 144.0f),
                    PathNode.LineTo(134.39f, 144.0f),
                    PathNode.LineTo(153.39f, 172.44f),
                    PathNode.CurveTo(155.84215f, 176.11821f, 160.81178f, 177.11214f, 164.49f, 174.66f),
                    PathNode.CurveTo(168.16821f, 172.20786f, 169.16214f, 167.23822f, 166.71f, 163.56f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 96.0f),
                    PathNode.LineTo(136.0f, 96.0f),
                    PathNode.CurveTo(144.83656f, 96.0f, 152.0f, 103.163445f, 152.0f, 112.0f),
                    PathNode.CurveTo(152.0f, 120.836555f, 144.83656f, 128.0f, 136.0f, 128.0f),
                    PathNode.LineTo(112.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _trademarkRegistered!!
    }

private var _trademarkRegistered: ImageVector? = null

package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MoneyWavy: ImageVector
    get() {
        if (_moneyWavy != null) return _moneyWavy!!
        _moneyWavy = phosphorFillIcon(
            name = "MoneyWavy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.24f, 60.0f),
                    PathNode.CurveTo(241.89862f, 58.538746f, 238.96938f, 58.387554f, 236.49f, 59.6f),
                    PathNode.CurveTo(193.56f, 80.6f, 162.9f, 70.76f, 130.49f, 60.38f),
                    PathNode.CurveTo(96.4f, 49.53f, 61.2f, 38.28f, 12.49f, 62.06f),
                    PathNode.CurveTo(9.745465f, 63.40003f, 8.003389f, 66.1858f, 8.0f, 69.24f),
                    PathNode.LineTo(8.0f, 189.17f),
                    PathNode.CurveTo(7.999612f, 191.92938f, 9.4213f, 194.49419f, 11.761599f, 195.9561f),
                    PathNode.CurveTo(14.101897f, 197.41803f, 17.03039f, 197.57068f, 19.51f, 196.36f),
                    PathNode.CurveTo(62.44f, 175.36f, 93.1f, 185.2f, 125.56f, 195.58f),
                    PathNode.CurveTo(144.8f, 201.73f, 164.4f, 208.0f, 186.56f, 208.0f),
                    PathNode.CurveTo(203.65f, 208.0f, 222.29f, 204.28f, 243.47f, 193.94f),
                    PathNode.CurveTo(246.21454f, 192.59998f, 247.9566f, 189.8142f, 247.96f, 186.76f),
                    PathNode.LineTo(247.96f, 66.83f),
                    PathNode.CurveTo(247.98456f, 64.06322f, 246.57768f, 61.480175f, 244.24f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 152.0f),
                    PathNode.CurveTo(48.0f, 156.41827f, 44.418278f, 160.0f, 40.0f, 160.0f),
                    PathNode.CurveTo(35.581722f, 160.0f, 32.0f, 156.41827f, 32.0f, 152.0f),
                    PathNode.LineTo(32.0f, 88.0f),
                    PathNode.CurveTo(32.0f, 83.58172f, 35.581722f, 80.0f, 40.0f, 80.0f),
                    PathNode.CurveTo(44.418278f, 80.0f, 48.0f, 83.58172f, 48.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 160.0f),
                    PathNode.CurveTo(110.32689f, 160.0f, 96.0f, 145.67311f, 96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 110.32689f, 110.32689f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(145.67311f, 96.0f, 160.0f, 110.32689f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 145.67311f, 145.67311f, 160.0f, 128.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 168.0f),
                    PathNode.CurveTo(224.0f, 172.41827f, 220.41827f, 176.0f, 216.0f, 176.0f),
                    PathNode.CurveTo(211.58173f, 176.0f, 208.0f, 172.41827f, 208.0f, 168.0f),
                    PathNode.LineTo(208.0f, 104.0f),
                    PathNode.CurveTo(208.0f, 99.58172f, 211.58173f, 96.0f, 216.0f, 96.0f),
                    PathNode.CurveTo(220.41827f, 96.0f, 224.0f, 99.58172f, 224.0f, 104.0f),
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
        return _moneyWavy!!
    }

private var _moneyWavy: ImageVector? = null

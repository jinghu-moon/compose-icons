package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.MoneyWavy: ImageVector
    get() {
        if (_moneyWavy != null) return _moneyWavy!!
        _moneyWavy = phosphorDuotoneIcon(
            name = "MoneyWavy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 69.21f),
                    PathNode.LineTo(16.0f, 189.21f),
                    PathNode.CurveTo(107.64f, 144.44f, 148.36f, 231.56f, 240.0f, 186.79f),
                    PathNode.LineTo(240.0f, 66.79f),
                    PathNode.CurveTo(148.36f, 111.56f, 107.64f, 24.44f, 16.0f, 69.21f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 152.0f),
                    PathNode.CurveTo(114.74516f, 152.0f, 104.0f, 141.25484f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 114.74516f, 114.74516f, 104.0f, 128.0f, 104.0f),
                    PathNode.CurveTo(141.25484f, 104.0f, 152.0f, 114.74516f, 152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 141.25484f, 141.25484f, 152.0f, 128.0f, 152.0f),
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
                    PathNode.MoveTo(244.24f, 60.0f),
                    PathNode.CurveTo(241.89862f, 58.538746f, 238.96938f, 58.387554f, 236.49f, 59.6f),
                    PathNode.CurveTo(193.56f, 80.6f, 162.9f, 70.76f, 130.49f, 60.38f),
                    PathNode.CurveTo(96.49f, 49.49f, 61.24f, 38.24f, 12.54f, 62.02f),
                    PathNode.CurveTo(9.763011f, 63.352077f, 7.997333f, 66.16005f, 8.0f, 69.24f),
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
                    PathNode.MoveTo(232.0f, 181.67f),
                    PathNode.CurveTo(191.4f, 199.84f, 161.75f, 190.36f, 130.44f, 180.35f),
                    PathNode.CurveTo(111.2f, 174.2f, 91.6f, 167.93f, 69.44f, 167.93f),
                    PathNode.CurveTo(53.87103f, 168.00563f, 38.460426f, 171.0606f, 24.04f, 176.93f),
                    PathNode.LineTo(24.04f, 74.33f),
                    PathNode.CurveTo(64.64f, 56.16f, 94.29f, 65.64f, 125.6f, 75.65f),
                    PathNode.CurveTo(156.91f, 85.66f, 189.14f, 96.0f, 232.0f, 79.09f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 96.0f),
                    PathNode.CurveTo(110.32689f, 96.0f, 96.0f, 110.32689f, 96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 145.67311f, 110.32689f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(145.67311f, 160.0f, 160.0f, 145.67311f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 110.32689f, 145.67311f, 96.0f, 128.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 144.0f),
                    PathNode.CurveTo(119.163445f, 144.0f, 112.0f, 136.83656f, 112.0f, 128.0f),
                    PathNode.CurveTo(112.0f, 119.163445f, 119.163445f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(136.83656f, 112.0f, 144.0f, 119.163445f, 144.0f, 128.0f),
                    PathNode.CurveTo(144.0f, 136.83656f, 136.83656f, 144.0f, 128.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 96.0f),
                    PathNode.LineTo(56.0f, 144.0f),
                    PathNode.CurveTo(56.0f, 148.41827f, 52.418278f, 152.0f, 48.0f, 152.0f),
                    PathNode.CurveTo(43.581722f, 152.0f, 40.0f, 148.41827f, 40.0f, 144.0f),
                    PathNode.LineTo(40.0f, 96.0f),
                    PathNode.CurveTo(40.0f, 91.58172f, 43.581722f, 88.0f, 48.0f, 88.0f),
                    PathNode.CurveTo(52.418278f, 88.0f, 56.0f, 91.58172f, 56.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 160.0f),
                    PathNode.LineTo(200.0f, 112.0f),
                    PathNode.CurveTo(200.0f, 107.58172f, 203.58173f, 104.0f, 208.0f, 104.0f),
                    PathNode.CurveTo(212.41827f, 104.0f, 216.0f, 107.58172f, 216.0f, 112.0f),
                    PathNode.LineTo(216.0f, 160.0f),
                    PathNode.CurveTo(216.0f, 164.41827f, 212.41827f, 168.0f, 208.0f, 168.0f),
                    PathNode.CurveTo(203.58173f, 168.0f, 200.0f, 164.41827f, 200.0f, 160.0f),
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
        return _moneyWavy!!
    }

private var _moneyWavy: ImageVector? = null

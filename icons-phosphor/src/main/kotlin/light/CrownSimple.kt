package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CrownSimple: ImageVector
    get() {
        if (_crownSimple != null) return _crownSimple!!
        _crownSimple = phosphorLightIcon(
            name = "CrownSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(230.0f, 75.4f),
                    PathNode.CurveTo(224.37076f, 72.65629f, 217.60123f, 74.024956f, 213.48f, 78.74f),
                    PathNode.LineTo(177.74f, 117.26f),
                    PathNode.LineTo(140.71f, 34.13f),
                    PathNode.CurveTo(138.4146f, 29.16216f, 133.43503f, 25.9872f, 127.96255f, 26.002253f),
                    PathNode.CurveTo(122.49007f, 26.017303f, 117.52804f, 29.21961f, 115.26f, 34.2f),
                    PathNode.LineTo(78.26f, 117.26f),
                    PathNode.LineTo(42.48f, 78.74f),
                    PathNode.CurveTo(38.322533f, 74.05422f, 31.558332f, 72.70054f, 25.917791f, 75.42548f),
                    PathNode.CurveTo(20.27725f, 78.15042f, 17.13338f, 84.290695f, 18.22f, 90.46f),
                    PathNode.CurveTo(18.22f, 90.54f, 18.22f, 90.62f, 18.27f, 90.7f),
                    PathNode.LineTo(41.0f, 194.57f),
                    PathNode.CurveTo(42.233788f, 201.17706f, 47.988777f, 205.97499f, 54.71f, 206.0f),
                    PathNode.LineTo(201.29f, 206.0f),
                    PathNode.CurveTo(208.03008f, 205.999f, 213.81271f, 201.19554f, 215.05f, 194.57f),
                    PathNode.LineTo(237.73f, 90.7f),
                    PathNode.CurveTo(237.73f, 90.62f, 237.73f, 90.54f, 237.78f, 90.46f),
                    PathNode.CurveTo(238.90541f, 84.25604f, 235.7109f, 78.07231f, 230.0f, 75.4f),
                    PathNode.Close,
                    PathNode.MoveTo(226.0f, 88.29f),
                    PathNode.LineTo(203.31f, 192.11f),
                    PathNode.CurveTo(203.28844f, 192.18889f, 203.27174f, 192.26906f, 203.26f, 192.35f),
                    PathNode.CurveTo(203.0884f, 193.31616f, 202.24118f, 194.01512f, 201.26f, 194.0f),
                    PathNode.LineTo(54.71f, 194.0f),
                    PathNode.CurveTo(53.728825f, 194.01512f, 52.88161f, 193.31616f, 52.71f, 192.35f),
                    PathNode.CurveTo(52.698257f, 192.26906f, 52.68156f, 192.18889f, 52.66f, 192.11f),
                    PathNode.LineTo(30.0f, 88.29f),
                    PathNode.CurveTo(29.82234f, 87.42228f, 30.295147f, 86.55266f, 31.12f, 86.23f),
                    PathNode.CurveTo(31.91667f, 85.78146f, 32.921833f, 85.9859f, 33.48f, 86.71f),
                    PathNode.LineTo(33.6f, 86.84f),
                    PathNode.LineTo(75.6f, 132.08f),
                    PathNode.CurveTo(76.97101f, 133.55794f, 78.99258f, 134.24858f, 80.981285f, 133.91847f),
                    PathNode.CurveTo(82.96999f, 133.58836f, 84.66001f, 132.28162f, 85.48f, 130.44f),
                    PathNode.LineTo(126.18f, 39.16f),
                    PathNode.CurveTo(126.49137f, 38.436684f, 127.21285f, 37.97684f, 128.0f, 38.0f),
                    PathNode.CurveTo(128.75977f, 37.967606f, 129.46349f, 38.398533f, 129.78f, 39.09f),
                    PathNode.LineTo(170.52f, 130.44f),
                    PathNode.CurveTo(171.33998f, 132.28162f, 173.03f, 133.58836f, 175.0187f, 133.91847f),
                    PathNode.CurveTo(177.00743f, 134.24858f, 179.02899f, 133.55794f, 180.4f, 132.08f),
                    PathNode.LineTo(222.4f, 86.84f),
                    PathNode.LineTo(222.52f, 86.71f),
                    PathNode.CurveTo(223.07817f, 85.9859f, 224.08333f, 85.78146f, 224.88f, 86.23f),
                    PathNode.CurveTo(225.70485f, 86.55266f, 226.17766f, 87.42228f, 226.0f, 88.29f),
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
        return _crownSimple!!
    }

private var _crownSimple: ImageVector? = null

package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Ear: ImageVector
    get() {
        if (_ear != null) return _ear!!
        _ear = phosphorFillIcon(
            name = "Ear",
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
                    PathNode.MoveTo(148.0f, 152.0f),
                    PathNode.CurveTo(148.45227f, 151.99858f, 148.90137f, 151.9243f, 149.33f, 151.78f),
                    PathNode.CurveTo(153.46834f, 150.39537f, 157.95287f, 152.58266f, 159.40952f, 156.69621f),
                    PathNode.CurveTo(160.86617f, 160.80975f, 158.75749f, 165.33177f, 154.67f, 166.86f),
                    PathNode.CurveTo(148.5476f, 169.02582f, 141.75476f, 168.08414f, 136.4524f, 164.3345f),
                    PathNode.CurveTo(131.15004f, 160.58488f, 127.998375f, 154.4942f, 128.0f, 148.0f),
                    PathNode.CurveTo(128.0f, 139.15f, 132.77f, 132.77f, 137.0f, 127.13f),
                    PathNode.CurveTo(140.77f, 122.13f, 144.0f, 117.75f, 144.0f, 112.0f),
                    PathNode.CurveTo(144.0f, 103.163445f, 136.83656f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(119.163445f, 96.0f, 112.0f, 103.163445f, 112.0f, 112.0f),
                    PathNode.CurveTo(112.0f, 116.41828f, 108.41828f, 120.0f, 104.0f, 120.0f),
                    PathNode.CurveTo(99.58172f, 120.0f, 96.0f, 116.41828f, 96.0f, 112.0f),
                    PathNode.CurveTo(96.0f, 94.32689f, 110.32689f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(145.67311f, 80.0f, 160.0f, 94.32689f, 160.0f, 112.0f),
                    PathNode.CurveTo(160.0f, 123.07f, 154.34f, 130.63f, 149.8f, 136.71f),
                    PathNode.CurveTo(146.2f, 141.52f, 144.0f, 144.64f, 144.0f, 148.0f),
                    PathNode.CurveTo(144.0f, 150.20914f, 145.79086f, 152.0f, 148.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 120.0f),
                    PathNode.CurveTo(179.58173f, 120.0f, 176.0f, 116.41828f, 176.0f, 112.0f),
                    PathNode.CurveTo(176.0f, 85.49033f, 154.50967f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(101.49033f, 64.0f, 80.0f, 85.49033f, 80.0f, 112.0f),
                    PathNode.CurveTo(80.0f, 123.9f, 86.71f, 132.5f, 93.82f, 141.6f),
                    PathNode.CurveTo(100.82f, 150.52f, 108.0f, 159.75f, 108.0f, 172.0f),
                    PathNode.CurveTo(107.99712f, 180.05415f, 112.82573f, 187.32416f, 120.25075f, 190.44485f),
                    PathNode.CurveTo(127.67574f, 193.56554f, 136.2482f, 191.9279f, 142.0f, 186.29f),
                    PathNode.CurveTo(144.0139f, 184.16121f, 147.03056f, 183.3039f, 149.86304f, 184.05539f),
                    PathNode.CurveTo(152.6955f, 184.80687f, 154.8904f, 187.04689f, 155.5841f, 189.89406f),
                    PathNode.CurveTo(156.27785f, 192.74121f, 155.35933f, 195.73982f, 153.19f, 197.71f),
                    PathNode.CurveTo(142.83743f, 207.84966f, 127.41454f, 210.7937f, 114.05493f, 205.18044f),
                    PathNode.CurveTo(100.695305f, 199.56717f, 92.0036f, 186.49097f, 92.0f, 172.0f),
                    PathNode.CurveTo(92.0f, 165.26f, 87.0f, 158.86f, 81.21f, 151.45f),
                    PathNode.CurveTo(73.54f, 141.63f, 64.0f, 129.41f, 64.0f, 112.0f),
                    PathNode.CurveTo(64.0f, 76.65378f, 92.65378f, 48.0f, 128.0f, 48.0f),
                    PathNode.CurveTo(163.34622f, 48.0f, 192.0f, 76.65378f, 192.0f, 112.0f),
                    PathNode.CurveTo(192.0f, 116.41828f, 188.41827f, 120.0f, 184.0f, 120.0f),
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
        return _ear!!
    }

private var _ear: ImageVector? = null

package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.PingPong: ImageVector
    get() {
        if (_pingPong != null) return _pingPong!!
        _pingPong = phosphorLightIcon(
            name = "PingPong",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.0f, 196.2f),
                    PathNode.CurveTo(237.63914f, 192.10449f, 235.49629f, 188.3746f, 232.14f, 186.0f),
                    PathNode.LineTo(192.21f, 157.48f),
                    PathNode.LineTo(210.83f, 138.86f),
                    PathNode.CurveTo(219.7884f, 129.99223f, 223.71475f, 117.22976f, 221.29f, 104.86f),
                    PathNode.CurveTo(216.73933f, 82.46342f, 204.4602f, 62.379326f, 186.6f, 48.12f),
                    PathNode.CurveTo(168.49425f, 33.518517f, 145.85777f, 25.698324f, 122.6f, 26.01f),
                    PathNode.CurveTo(69.62794f, 26.913235f, 26.903234f, 69.63794f, 26.0f, 122.61f),
                    PathNode.CurveTo(25.710987f, 145.86412f, 33.528606f, 168.49313f, 48.11f, 186.61f),
                    PathNode.CurveTo(62.36258f, 204.46819f, 82.43972f, 216.74739f, 104.83f, 221.3f),
                    PathNode.CurveTo(117.19975f, 223.72475f, 129.96223f, 219.7984f, 138.83f, 210.84f),
                    PathNode.LineTo(157.45f, 192.22f),
                    PathNode.LineTo(186.0f, 232.14f),
                    PathNode.CurveTo(188.3746f, 235.49629f, 192.10449f, 237.63914f, 196.2f, 238.0f),
                    PathNode.CurveTo(196.59f, 238.0f, 196.98f, 238.05f, 197.36f, 238.05f),
                    PathNode.CurveTo(201.06966f, 238.04762f, 204.62674f, 236.573f, 207.25f, 233.95f),
                    PathNode.LineTo(233.9f, 207.31f),
                    PathNode.CurveTo(236.84279f, 204.39546f, 238.34402f, 200.32748f, 238.0f, 196.2f),
                    PathNode.Close,
                    PathNode.MoveTo(57.47f, 179.08f),
                    PathNode.CurveTo(44.638855f, 163.13994f, 37.75515f, 143.23128f, 38.0f, 122.77f),
                    PathNode.CurveTo(38.811726f, 76.293205f, 76.293205f, 38.811726f, 122.77f, 38.0f),
                    PathNode.CurveTo(143.22884f, 37.75983f, 163.1349f, 44.639107f, 179.08f, 57.46f),
                    PathNode.CurveTo(187.0375f, 63.87368f, 193.80696f, 71.63487f, 199.08f, 80.39f),
                    PathNode.LineTo(80.4f, 199.12f),
                    PathNode.CurveTo(71.63963f, 193.8377f, 63.877796f, 187.05414f, 57.47f, 179.08f),
                    PathNode.Close,
                    PathNode.MoveTo(225.41f, 198.77f),
                    PathNode.LineTo(198.77f, 225.41f),
                    PathNode.CurveTo(198.35548f, 225.81102f, 197.78806f, 226.01358f, 197.21329f, 225.96568f),
                    PathNode.CurveTo(196.63852f, 225.91779f, 196.11241f, 225.6241f, 195.77f, 225.16f),
                    PathNode.LineTo(163.13f, 179.47f),
                    PathNode.CurveTo(162.09103f, 178.03232f, 160.46918f, 177.12802f, 158.7f, 177.0f),
                    PathNode.LineTo(158.21f, 177.0f),
                    PathNode.CurveTo(156.61923f, 177.0014f, 155.09413f, 177.63446f, 153.97f, 178.76f),
                    PathNode.LineTo(130.34f, 202.38f),
                    PathNode.LineTo(130.34f, 202.38f),
                    PathNode.CurveTo(124.302f, 208.49486f, 115.60643f, 211.18571f, 107.17f, 209.55f),
                    PathNode.CurveTo(101.86359f, 208.4916f, 96.67496f, 206.91055f, 91.68f, 204.83f),
                    PathNode.LineTo(204.8f, 91.68f),
                    PathNode.CurveTo(206.87938f, 96.67538f, 208.46039f, 101.86388f, 209.52f, 107.17f),
                    PathNode.CurveTo(211.15686f, 115.60834f, 208.46164f, 124.30589f, 202.34f, 130.34f),
                    PathNode.LineTo(178.72f, 154.0f),
                    PathNode.CurveTo(177.47415f, 155.24632f, 176.83916f, 156.97733f, 176.9836f, 158.73364f),
                    PathNode.CurveTo(177.12802f, 160.48994f, 178.03726f, 162.09396f, 179.47f, 163.12f),
                    PathNode.LineTo(225.16f, 195.76f),
                    PathNode.CurveTo(225.6241f, 196.10242f, 225.91779f, 196.62852f, 225.96568f, 197.20328f),
                    PathNode.CurveTo(226.01358f, 197.77803f, 225.81102f, 198.34549f, 225.41f, 198.76f),
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
        return _pingPong!!
    }

private var _pingPong: ImageVector? = null

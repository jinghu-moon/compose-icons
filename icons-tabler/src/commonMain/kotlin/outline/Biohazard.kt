package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Biohazard: ImageVector
    get() {
        if (_biohazard != null) return _biohazard!!
        _biohazard = tablerOutlineIcon(
            name = "Biohazard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 12.0f),
                    PathNode.CurveTo(10.0f, 13.104569f, 10.895431f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(13.104569f, 14.0f, 14.0f, 13.104569f, 14.0f, 12.0f),
                    PathNode.CurveTo(14.0f, 10.895431f, 13.104569f, 10.0f, 12.0f, 10.0f),
                    PathNode.CurveTo(10.895431f, 10.0f, 10.0f, 10.895431f, 10.0f, 12.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.939f, 14.0f),
                    PathNode.CurveTo(11.939f, 14.173f, 11.987f, 14.351f, 11.995f, 14.533f),
                    PathNode.LineTo(11.995f, 14.75f),
                    PathNode.CurveTo(11.994978f, 17.28896f, 9.998308f, 19.37901f, 7.462f, 19.495f),
                    PathNode.LineTo(7.245f, 19.495f),
                    PathNode.MoveTo(2.495f, 14.745f),
                    PathNode.CurveTo(2.495109f, 12.914562f, 3.546973f, 11.247053f, 5.198881f, 10.45857f),
                    PathNode.CurveTo(6.850788f, 9.670087f, 8.808774f, 9.900944f, 10.232f, 11.052f),
                    PathNode.MoveTo(16.745f, 19.495f),
                    PathNode.CurveTo(15.353654f, 19.49502f, 14.032255f, 18.885014f, 13.129763f, 17.826077f),
                    PathNode.CurveTo(12.227269f, 16.767138f, 11.834435f, 15.365752f, 12.055f, 13.992f),
                    PathNode.LineTo(11.995f, 13.992f),
                    PathNode.MoveTo(13.759f, 11.048f),
                    PathNode.CurveTo(15.151948f, 9.922077f, 17.0598f, 9.675426f, 18.693289f, 10.410083f),
                    PathNode.CurveTo(20.326777f, 11.144741f, 21.40813f, 12.735782f, 21.49f, 14.525f),
                    PathNode.LineTo(21.49f, 14.742f),
                    PathNode.MoveTo(10.295f, 10.929f),
                    PathNode.CurveTo(8.830348f, 10.369684f, 7.736028f, 9.123664f, 7.370476f, 7.599062f),
                    PathNode.CurveTo(7.004923f, 6.07446f, 7.415229f, 4.467677f, 8.467f, 3.305f),
                    PathNode.LineTo(8.631f, 3.133f),
                    PathNode.MoveTo(15.349f, 3.133f),
                    PathNode.CurveTo(16.488195f, 4.271466f, 16.97291f, 5.909632f, 16.636612f, 7.484679f),
                    PathNode.CurveTo(16.300312f, 9.059725f, 15.188818f, 10.357075f, 13.684f, 10.931f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _biohazard!!
    }

private var _biohazard: ImageVector? = null

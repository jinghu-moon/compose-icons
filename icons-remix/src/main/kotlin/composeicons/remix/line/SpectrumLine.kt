package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SpectrumLine: ImageVector
    get() {
        if (_spectrumLine != null) return _spectrumLine!!
        _spectrumLine = remixIcon(
            name = "SpectrumLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.389 2.001l1.811 .004 .844 .014c7.161 .165 7.939 1.512 7.957 9.667l-.005 1.512-.014 .844c-.165 7.161-1.512 7.938-9.667 7.957l-1.512-.006-.888-.015C3.06 21.816 2.086 20.552 2.007 13.199L2.001 11.691l.006-.89 .014-.865C2.186 2.883 3.507 2.039 11.389 2.001ZM14.12 4.009 10.883 4.001 9.561 4.011C4.072 4.093 4.017 4.832 4.002 11.414l.001 2.175 .011 1.041c.088 4.982 .792 5.343 6.399 5.369l3.455-.002 .776-.009c5.108-.092 5.347-.837 5.357-6.877l-.002-2.743L19.986 9.312C19.892 4.516 19.201 4.063 14.12 4.009ZM8.251 7c4.832 0 8.75 3.918 8.75 8.75v.583c0 .368-.299 .667-.667 .667h-3.667c-.368 0-.667-.298-.667-.667v-.583c0-2.071-1.679-3.75-3.75-3.75h-.583c-.368 0-.667-.298-.667-.667v-3.667c0-.368 .299-.667 .667-.667h.583Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _spectrumLine!!
    }

private var _spectrumLine: ImageVector? = null

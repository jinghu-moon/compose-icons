package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BellLine: ImageVector
    get() {
        if (_bellLine != null) return _bellLine!!
        _bellLine = remixIcon(
            name = "BellLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14.121 9.879c4.296 4.296 6.828 8.728 5.657 9.9-.475 .475-1.486 .341-2.807-.273C13.746 21.645 9.447 21.487 6.382 19.032l-.039 .039L4.929 17.657l.038-.039C2.513 14.552 2.355 10.254 4.495 7.03 3.881 5.708 3.747 4.697 4.222 4.222 5.35 3.094 9.499 5.399 13.639 9.404l.482 .474ZM12.707 11.293C10.823 9.409 8.87 7.842 7.236 6.87l-.186 .181C4.557 9.544 4.338 13.45 6.393 16.192L8.239 14.346c-.178-.667-.006-1.409 .518-1.932 .781-.781 2.047-.781 2.828 0 .781 .781 .781 2.047 0 2.828-.523 .523-1.264 .696-1.931 .518L7.807 17.607c2.742 2.056 6.649 1.837 9.142-.657l.179-.187-.053-.089c-.976-1.615-2.52-3.531-4.369-5.381ZM19.778 4.222c.781 .781 .781 2.047 0 2.828-.053 .053-.108 .102-.165 .148 1.592 2.517 1.813 5.654 .662 8.345-.377-.736-.841-1.511-1.386-2.306 .39-2.177-.257-4.504-1.94-6.187C15.267 5.367 12.94 4.72 10.763 5.11 9.968 4.565 9.193 4.1 8.457 3.724c2.69-1.151 5.828-.93 8.347 .662 .044-.057 .093-.112 .146-.165 .781-.781 2.047-.781 2.829 0Z"),
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
        return _bellLine!!
    }

private var _bellLine: ImageVector? = null

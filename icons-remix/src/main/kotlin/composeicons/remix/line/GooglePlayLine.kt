package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GooglePlayLine: ImageVector
    get() {
        if (_googlePlayLine != null) return _googlePlayLine!!
        _googlePlayLine = remixIcon(
            name = "GooglePlayLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.001 1.734c.176 0 .349 .046 .501 .135l16.004 9.266c.478 .277 .641 .889 .364 1.367-.087 .151-.213 .277-.364 .364L4.502 22.131c-.478 .277-1.09 .114-1.366-.364-.088-.152-.135-.325-.135-.501v-18.531c0-.552 .448-1 1-1ZM12.293 13.413 7.795 17.912l5.699-3.299L12.293 13.413ZM5 6.119v11.759l5.879-5.879L5 6.119ZM15.284 10.421l-1.577 1.578 1.578 1.577 2.724-1.576L15.284 10.421ZM7.794 6.085l4.499 4.5L13.493 9.384 7.794 6.085Z"),
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
        return _googlePlayLine!!
    }

private var _googlePlayLine: ImageVector? = null

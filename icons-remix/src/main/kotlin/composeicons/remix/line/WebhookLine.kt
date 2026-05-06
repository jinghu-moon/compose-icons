package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.WebhookLine: ImageVector
    get() {
        if (_webhookLine != null) return _webhookLine!!
        _webhookLine = remixIcon(
            name = "WebhookLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.869 14.139c-.213 .352-.319 .639-.148 1.086 .47 1.236-.193 2.439-1.439 2.765C6.106 18.299 4.96 17.526 4.727 16.268c-.207-1.114 .658-2.206 1.886-2.38 .067-.01 .134-.014 .221-.019 .047-.003 .099-.006 .16-.011L8.862 10.726C7.687 9.557 6.988 8.192 7.142 6.499 7.252 5.303 7.722 4.269 8.582 3.422c1.647-1.623 4.159-1.885 6.098-.64 1.862 1.196 2.715 3.527 1.988 5.521L14.961 7.84c.228-1.109 .06-2.105-.688-2.958-.494-.563-1.128-.858-1.849-.967C10.978 3.697 9.559 4.625 9.138 6.044c-.478 1.61 .245 2.925 2.222 3.916-.829 1.394-1.652 2.792-2.492 4.179ZM13.784 8.273c.598 1.055 1.205 2.125 1.806 3.186 3.041-.941 5.333 .743 6.156 2.545 .993 2.177 .314 4.755-1.637 6.098-2.003 1.379-4.535 1.143-6.31-.628l1.392-1.165c1.753 1.135 3.285 1.082 4.423-.262 .97-1.147 .949-2.856-.049-3.979-1.152-1.295-2.696-1.335-4.562-.091C14.231 12.604 13.443 11.241 12.694 9.858c-.253-.466-.532-.736-1.101-.835C10.641 8.858 10.027 8.042 9.99 7.126c-.036-.905 .497-1.723 1.33-2.042 .825-.316 1.794-.061 2.35 .641 .454 .573 .598 1.219 .359 1.926-.045 .134-.099 .264-.158 .407-.028 .068-.057 .139-.087 .215ZM11.552 16.895h3.661c.051 .068 .099 .135 .145 .201 .097 .137 .19 .267 .297 .383 .775 .829 2.084 .87 2.913 .101 .859-.797 .898-2.137 .086-2.969-.794-.815-2.152-.892-2.889-.03-.448 .524-.907 .586-1.501 .576-1.523-.024-3.046-.008-4.569-.008 .099 2.142-.711 3.476-2.317 3.793C5.806 19.253 4.358 18.45 3.848 16.986c-.579-1.664 .137-2.994 2.207-4.05-.156-.564-.313-1.135-.469-1.701-2.256 .492-3.948 2.68-3.773 5.142 .154 2.173 1.907 4.104 4.051 4.449 1.165 .188 2.259-.007 3.274-.583 1.306-.741 2.064-1.906 2.415-3.349Z"),
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
        return _webhookLine!!
    }

private var _webhookLine: ImageVector? = null
